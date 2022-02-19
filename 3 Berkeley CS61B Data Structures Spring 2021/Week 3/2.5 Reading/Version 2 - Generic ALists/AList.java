//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/*
 * Invariants:
 * addLast: The next item we want to add, will go into position size
 * getLast: The item we want to return is in position size - 1
 * size: The number of items in the list should be size.
 */

public class AList<Item> {
  private Item[] items;
  private int size;

  /** Creates an empty list. */
  public AList() {
    items = (Item[]) new Object[100];
    size = 0;
  }

  private void resize(int capacity) {
    Item[] a = (Item[]) new Object[capacity];
    System.arraycopy(items, 0, a, 0, size);
    items = a;
  }

  /** Inserts X into the back of the list. */
  public void addLast(Item x) {
    if (size == items.length) {
      // int[] a = new int[size + 1];
      // System.arraycopy(items, 0, a, 0, size);
      // items = a;
      // 把上面3行代码放进一个方法(resize)里
      // resize(size + 1); // size + 一个数的方式来扩容，如果数组特别大，会很耗时间。改为size乘以一个数，耗时会短很多。
      resize(size * 2);
    }

    items[size] = x;
    size++;
  }

  /** Returns the item from the back of the list. */
  public Item getLast() {
    return items[size - 1];
  }

  /** Gets the ith item in the list (0 is the front). */
  public Item get(int i) {
    return items[i];
  }

  /** Returns the number of items in the list. */
  public int size() {
    return size;
  }

  /**
   * Deletes item from back of the list and
   * returns deleted item.
   */
  public Item removeLast() {
    Item returnItem = getLast();
    items[size - 1] = null;
    size--;
    return returnItem;
  }

  public void addFirst(Item x) {
    Item[] newItems;
    if (size == items.length) {
      newItems = (Item[]) new Object[items.length + 1];
    } else {
      newItems = (Item[]) new Object[items.length];
    }
    System.arraycopy(items, 0, newItems, 1, size);
    items = newItems;
    items[0] = x;
    size++;
  }

  public Item getFirst() {
    return items[0];
  }
}