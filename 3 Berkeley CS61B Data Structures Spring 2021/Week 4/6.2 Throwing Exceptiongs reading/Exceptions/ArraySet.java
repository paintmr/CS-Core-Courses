import java.util.Iterator;

public class ArraySet<T>{
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

}
