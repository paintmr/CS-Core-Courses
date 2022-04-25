package deque;

import java.util.Iterator;
import java.text.DecimalFormat;

public class ArrayDeque<T> implements Deque<T>, Iterable<T> {
  private T[] items = (T[]) new Object[8];
  private int size;
  private int nextFirst;
  private int nextLast;

  // Creates an empty array deque.
  public ArrayDeque() {
    size = 0;
    nextFirst = 4;
    nextLast = 5;
  }

  public ArrayDeque(T item) {
    items[4] = item;
    size = 0;
    nextFirst = 3;
    nextLast = 5;
  }

  private void expandArr(int capacity, int startPoint) {
    T[] newItems = (T[]) new Object[capacity];
    // 每一次扩容，都把nextFirst设为0，nextLast设为size
    // 很多时候，在items满员时，nextFirst会停在数组中间。那么新数组拷贝2次。第一次拷贝nextFirst到items.length-1的位置。第二次拷贝items第0个到nextFirst-1的位置。
    int startPointToArrEnd = (items.length - 1) - (startPoint - 1);
    int arrHeadToStartPoint = startPoint;
    if (startPointToArrEnd > 0) {
      System.arraycopy(items, startPoint, newItems, 0, startPointToArrEnd);
    }
    if (arrHeadToStartPoint > 0) {
      System.arraycopy(items, 0, newItems, startPointToArrEnd, arrHeadToStartPoint);
    }
    items = newItems;
    nextFirst = items.length - 1;
    nextLast = size;
  }

  // Adds an item of type T to the front of the deque. You can assume that item is
  // never null.
  @Override
  public void addFirst(T item) {
    items[nextFirst] = item;
    size++;
    if (size == items.length) {
      expandArr(size * 2, nextFirst);
    } else {
      if (nextFirst == 0) {
        nextFirst = items.length - 1;
      } else {
        nextFirst--;
      }
    }
  }

  // Adds an item of type T to the back of the deque. You can assume that item is
  // never null.
  @Override
  public void addLast(T item) {
    items[nextLast] = item;
    size++;
    if (size == items.length) {
      expandArr(size * 2, nextLast + 1);
    } else {
      if (nextLast == items.length - 1) {
        nextLast = 0;
      } else {
        nextLast++;
      }
    }
  }

  // Returns true if deque is empty, false otherwise.
//  public boolean isEmpty() {
//    return size() == 0;
//  }

  // Returns the number of items in the deque.
  @Override
  public int size() {
    return size;
  }

  // Prints the items in the deque from first to last, separated by a space. Once
  // all the items have been printed, print out a new line.
  @Override
  public void printDeque() {
    if (isEmpty()) {
      System.out.println("empty ArrayDeque");
      return;
    }
    String[] itemsToBePrinted = new String[size];

    //
    if (getStopPoint() - getStartPoint() > 0) {
      // 数据位于数组的中间，两端有空位。
      for (int i = 0, j = getStartPoint(); i < size; i++, j++) {
        itemsToBePrinted[i] = items[j].toString();
      }
    } else {
      // 数据位于数组的两端，中间有空位。
      // 獲取nextFirst+1到items.length-1的items
      int startPointToArrEnd = (items.length - 1) - nextFirst;
      if (startPointToArrEnd > 0) {
        for (int i = 0, j = nextFirst + 1; i < startPointToArrEnd; i++, j++) {
          if (items[j] != null) {
            itemsToBePrinted[i] = items[j].toString();
          }
        }
      }
      // 獲取0到nextLast-1的items
      int arrStartToLastPoint = nextLast;
      if (arrStartToLastPoint > 0) {
        // j < arrStartToLastPoint可以替換為i< size
        for (int i = startPointToArrEnd, j = 0; j < arrStartToLastPoint; i++, j++) {
          if (items[j] != null) {
            itemsToBePrinted[i] = items[j].toString();
          }
        }
      }

    }

    String dequeStr = String.join(" ", itemsToBePrinted);
    System.out.println(dequeStr);
  }

  private float getUsageFactor() {
    // 把2个int的除法结果转换为float
    // 这里必须多写几个零。否则，例如pattern写"0.000"，算出usageFactor = 0.25012，会让usageFactor = 0.250，进而缩小array到原来的1/4。而事实上，usageFactor = 0.25012表明数据占据原来的数组是超过1/4的。这会导致缩小的数组无法容纳全部的数据。
//    DecimalFormat df = new DecimalFormat("0.000000");
//    String usageFactorStr = df.format((float) size / items.length);
//    float usageFactor = Float.parseFloat(usageFactorStr);
//    上面三行代码其实还有个缺陷：如果数据非常大，会出bug。比如虽然设置了new DecimalFormat()里面的参数到小数点后6位，但假如size/item.length = 0.25000012，这时候还是会取0.250000，还是会把array缩小为原来的1/4，显然缩小后的array是装不下所有数据的。

//    所以最保险的方法是把size/ items.length 的商在千分位向上取，这样只要结果大于0.25，就不会缩小数组
    // 必须先噶int size和items.length换成小数，否则Math.ceil不起作用
    float sizeCast = (float) size;
    float lengthCast = (float) items.length;
    // 目标是让0.25*的千分位向上取，可以先把25*变成整数部分，这样就变成了25*的个位数向上取整
    float usageFactorMagnified = (float) Math.ceil(sizeCast * 1000 / lengthCast); // 例如3019 * 1000 / 12072 ≈ 250.0828363154407，向上取整就是251.0
    float usageFactor = usageFactorMagnified / 1000; // 然后再把上述结果除以1000，得到0.251
    return usageFactor;
  }

  private int getStartPoint() {
    int startPoint = nextFirst == items.length - 1 ? 0 : nextFirst + 1;
    return startPoint;
  }

  private int getStopPoint() {
    int stopPoint = nextLast == 0 ? items.length - 1 : nextLast - 1;
    return stopPoint;
  }

  private void shrinkArr(int capacity, int startPoint, int stopPoint) {
    T[] newItems = (T[]) new Object[capacity];
    if (startPoint - stopPoint > 0) {
      int startPointToArrEnd = (items.length - 1) - (startPoint - 1);
      int arrHeadToStopPoint = stopPoint + 1;
      if (startPointToArrEnd > 0) {
        System.arraycopy(items, startPoint, newItems, 0, startPointToArrEnd);
      }
      if (arrHeadToStopPoint > 0) {
        System.arraycopy(items, 0, newItems, startPointToArrEnd, arrHeadToStopPoint);
      }
    } else {
      System.arraycopy(items, startPoint, newItems, 0, stopPoint - (startPoint - 1));
    }
    items = newItems;
    nextFirst = items.length - 1;
    nextLast = size == items.length ? 0 : size;
  }

  // Removes and returns the item at the front of the deque. If no such item
  // exists, returns null.
  @Override
  public T removeFirst() {
    if (size() == 0) {
      return null;
    }
    float usageFactor = getUsageFactor();

    int startPoint = getStartPoint();
    int stopPoint = getStopPoint();

    if (usageFactor <= 0.25) {
      int capacity = (int) (items.length * 0.25);
      shrinkArr(capacity, startPoint, stopPoint);
      T returnedItem = items[0];
      items[0] = null;
      nextFirst = 0;
      size--;
      return returnedItem;
    } else {
      T returnedItem = items[startPoint];
      items[startPoint] = null;
      nextFirst = startPoint;
      size--;
      return returnedItem;
    }
  }

  // Removes and returns the item at the back of the deque. If no such item
  // exists, returns null.
  @Override
  public T removeLast() {
    if (size() == 0) {
      return null;
    }
    float usageFactor = getUsageFactor();

    int startPoint = getStartPoint();
    int stopPoint = getStopPoint();

    if (usageFactor <= 0.25) {
      int capacity = (int) (items.length * 0.25);
      shrinkArr(capacity, startPoint, stopPoint);
      T returnedItem = items[size - 1];
      items[size - 1] = null;
      nextLast = size - 1;
      size--;
      return returnedItem;
    } else {
      T returnedItem = items[stopPoint];
      items[stopPoint] = null;
      nextLast = stopPoint;
      size--;
      return returnedItem;
    }
  }

  // Gets the item at the given index, where 0 is the front, 1 is the next item,
  // and so forth. If no such item exists, returns null. Must not alter the deque!
  @Override
  public T get(int index) {
    if (index >= size) {
      return null;
    } else {
      // 数据集中在数组中间
      if (getStopPoint() - getStartPoint() > 0) {
        return items[getStartPoint() + index];
      } else {
        // 数据分散在数组两端
        if (getStartPoint() + index >= items.length) {
          return items[index - (items.length - getStartPoint())];
        } else {
          return items[getStartPoint() + index];
        }
      }
    }
  }

  // The Deque objects we’ll make are iterable (i.e. Iterable<T>) so we must
  // provide this method to return an iterator.
  public Iterator<T> iterator() {
    return new ArrayDequeIterator();
  }

  private class ArrayDequeIterator implements Iterator<T> {
    private int indexPointer;

    public ArrayDequeIterator() {
      indexPointer = -1;
    }

    public boolean hasNext() {
      if (get(indexPointer + 1) == null) {
        return false;
      } else {
        return true;
      }
    }

    public T next() {
      T returnItem =(T) get(indexPointer + 1);
      indexPointer += 1;
      return returnItem;
    }
  }

  // Returns whether or not the parameter o is equal to the Deque. o is considered
  // equal if it is a Deque and if it contains the same contents (as goverened by
  // the generic T’s equals method) in the same order. (ADDED 2/12: You’ll need to
  // use the instance of keywords for this.)
  @Override
  public boolean equals(Object o){
    if (o == null) {
      return false;
    }
    if (o == this) {
      return true;
    }
    if (!(o instanceof ArrayDeque)) {
      return false;
    }
    ArrayDeque<T> arrDo = (ArrayDeque<T>) o;
    if (arrDo.size() != size()) {
      return false;
    }
    for(int i = 0; i < size; i++) {
      if(arrDo.get(i) != get(i)) {
        return false;
      }
    }
    return true;
  }
}
