package deque;
import java.util.Iterator;

public class ArrayDeque <T> implements Deque<T>, Iterable<T> {
      private T[] items = (T[]) new Object[8];
      private int size;
      private int nextFirst;
      private int nextLast;
  
      // Creates an empty array deque.
      public ArrayDeque(){
        size = 0;
        nextFirst = 4;
        nextLast = 5;
      }

      public ArrayDeque(T item){
        items[4] = item;
        size = 0;
        nextFirst = 3;
        nextLast = 5;
      }

      private void expandArr(int capacity, int startPoint) {
        T[] newItems = (T[]) new Object[capacity];
        // 每一次扩容，都把nextFirst设为0，nextLast设为size
        // 很多时候，在items满员时，nextFirst会停在数组中间。那么新数组拷贝2次。第一次拷贝nextFirst到items.length-1的位置。第二次拷贝items第0个到nextFirst-1的位置。
        int firstPositionToEnd = (items.length -1) - (startPoint -1);
        int headTofirstPosition = startPoint;
        if(firstPositionToEnd > 0) {
          System.arraycopy(items, startPoint, newItems, 0, firstPositionToEnd);
        }
        if(headTofirstPosition > 0) {
          System.arraycopy(items, 0, newItems, firstPositionToEnd, headTofirstPosition);
        }
        items = newItems;
        nextFirst = items.length - 1;
        nextLast = size;
      }
  
      // Adds an item of type T to the front of the deque. You can assume that item is never null.
      public void addFirst(T item) {
        items[nextFirst] = item;
        size++;
        if (size == items.length) {
          expandArr(size * 2, nextFirst);
        }else{
          if (nextFirst == 0) {
            nextFirst = items.length - 1;
          } else {
            nextFirst--;
          }
        }
      }

      // Adds an item of type T to the back of the deque. You can assume that item is never null.
      public void addLast(T item){
        items[nextLast] = item;
        size++;
        if (size == items.length) {
          expandArr(size * 2, nextLast+1);
        }else{
          if(nextLast == items.length -1) {
            nextLast = 0;
          } else {
            nextLast++;
          }
        }
      }
  
      // Returns true if deque is empty, false otherwise.
      public boolean isEmpty(){
        return size() == 0;
      }
  
      // Returns the number of items in the deque.
      public int size(){
        return size;
      }
  
      // Prints the items in the deque from first to last, separated by a space. Once all the items have been printed, print out a new line.
      public void printDeque(){
        if(isEmpty()){
          System.out.println("empty ArrayDeque");
          return;
        }
        String[] itemsToBePrinted = new String[size];
        // 獲取nextFirst+1到items.length-1的items
        int firstPointToArrEnd = (items.length -1) - nextFirst;
        if(firstPointToArrEnd > 0 ) {
          for (int i = 0, j = nextFirst + 1; i < firstPointToArrEnd; i++, j++) {
            itemsToBePrinted[i] = items[j].toString();
          }
        }
        // 獲取0到nextLast-1的items
        int arrStartToLastPoint = nextLast;
        if(arrStartToLastPoint > 0) {
          // j < arrStartToLastPoint可以替換為i< size
          for (int i = firstPointToArrEnd, j = 0; j < arrStartToLastPoint; i++, j++) {
            itemsToBePrinted[i] = items[j].toString();
          }
        }
  
        String dequeStr = String.join(" ", itemsToBePrinted);
        System.out.println(dequeStr);
      }
  
      // Removes and returns the item at the front of the deque. If no such item exists, returns null.
      public T removeFirst(){
        
      }
  
      // Removes and returns the item at the back of the deque. If no such item exists, returns null.
      public T removeLast();
  
      // Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque!
      public T get(int index);
  
      // The Deque objects we’ll make are iterable (i.e. Iterable<T>) so we must provide this method to return an iterator.
      // public Iterator<T> iterator();
  
      // Returns whether or not the parameter o is equal to the Deque. o is considered equal if it is a Deque and if it contains the same contents (as goverened by the generic T’s equals method) in the same order. (ADDED 2/12: You’ll need to use the instance of keywords for this.)
      public boolean equals(Object o);
}
