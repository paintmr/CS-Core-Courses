import java.util.Iterator;

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

  @Override
  public String toString() {
    // To solve the problem caused by using string concatenation, Java has a special
    // class called StringBuilder. It creates a string object that is mutable, so
    // you can continue appending to the same string object instead of creating a
    // new one each time.
    StringBuilder returnSB = new StringBuilder("{");
    for (int i = 0; i < size - 1; i++) {
      returnSB.append(items[i]);
      returnSB.append(", ");
    }
    returnSB.append(items[size - 1]);
    returnSB.append("}");
    return returnSB.toString();
  }
}
