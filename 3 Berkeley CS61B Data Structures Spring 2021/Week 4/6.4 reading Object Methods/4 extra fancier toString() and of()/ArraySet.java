import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ArraySet<T> implements Iterable<T> {
  private T[] items;
  private int size; // the next item to be added will be at position size

  public ArraySet() {
    items = (T[]) new Object[100];
    size = 0;
  }

  /*
   * Returns true if this map contains a mapping for the specified key.
   */
  public boolean contains(T x) {
    for (int i = 0; i < size; i++) {
      if (items[i].equals(x)) {
        return true;
      }
    }
    return false;
  }

  /* Associates the specified value with the specified key in this map. */
  public void add(T x) {
    if (x == null) {
      // Throws an IllegalArgumentException if they key is null.
      throw new IllegalArgumentException("You can't add null to an ArraySet.");
      // Ignores nulls that users tries to add.
      // return;
    }
    if (contains(x)) {
      return;
    }
    items[size] = x;
    size++;
  }

  /* Returns the number of key-value mappings in this map. */
  public int size() {
    return size;
  }

  /** returns an iterator (a.k.a. seer) into ME */
  public Iterator<T> iterator() {
    return new ArraySetIterator();
  }

  private class ArraySetIterator implements Iterator<T> {
    private int indexPointer;

    public ArraySetIterator() {
      indexPointer = -1;
    }

    public boolean hasNext() {
      return indexPointer + 1 < size;
    }

    public T next() {
      T returnItem = items[indexPointer + 1];
      indexPointer += 1;
      return returnItem;
    }
  }

  // @Override
  // public String toString() {
  // // To solve the problem caused by using string concatenation, Java has a
  // special
  // // class called StringBuilder. It creates a string object that is mutable, so
  // // you can continue appending to the same string object instead of creating a
  // // new one each time.
  // StringBuilder returnSB = new StringBuilder("{");
  // for (int i = 0; i < size - 1; i++) {
  // returnSB.append(items[i]);
  // returnSB.append(", ");
  // }
  // returnSB.append(items[size - 1]);
  // returnSB.append("}");
  // return returnSB.toString();
  // }
  @Override
  public String toString() {
    List<String> listofItems = new ArrayList<>();
    for (T x : this) {
      listofItems.add(x.toString());
    }
    return "{" + String.join(", ", listofItems) + "}";
  }

  @Override
  // It must take an Object argument, in order to override the original .equals()
  // method
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    }
    // It is never true for null. x.equals(null) must be false
    if (other == null) {
      return false;
    }
    if (other.getClass() != this.getClass()) {
      return false;
    }
    ArraySet<T> o = (ArraySet<T>) other;
    if (o.size() != this.size()) {
      return false;
    }
    for (T item : this) {
      if (!o.contains(item)) {
        return false;
      }
    }
    return true;
  }

  /**
   * 下面有兩個知識點：
   * （1）返回種類ArraySet<EType>前面的<EType>什麼意思？
   * 見java筆記Using generic METHODS.
   * If the class itself does not use a type parameter, you can still specify one
   * for a method,
   * by declaring it in a really unusual (but available) space—before the return
   * type.
   * 这个of()是个static
   * method。是直接用ArraySet这个class来调用，不像實例化ArraySet可以傳遞T的類別，这时候无法传递T（item的类别）。
   * 可以自己在method的signature中定义一下，下面的例子中写的是EType。這裡EType就可以作為這個static
   * method的泛型來傳遞類別。
   * （2）傳遞參數時，EType後面的省略號什麼意思？
   * 例子：private static int sumUp( int... values) {}中，方法參數為「int ...
   * values」，三個點表示values參數可選,並且這個參數不是一個，是一個參數數組。
   * 在下面的例子中，Etype可以是int，也可以是String，或者其它。表示傳遞進來一個int數組或者string數組。
   */
  public static <EType> ArraySet<EType> of(EType... stuff) {
    ArraySet<EType> returnArrSet = new ArraySet<>();
    for (EType x : stuff) {
      returnArrSet.add(x);
    }
    return returnArrSet;
  }
}
