//         0 1  2 3 4 5 6 7
// items: [6 9 -1 2 0 0 0 0 ...]
// size: 5

/* Invariants:
 addLast: The next item we want to add, will go into position size
 getLast: The item we want to return is in position size - 1
 size: The number of items in the list should be size.
*/

public class AList<EType> implements List61B<EType> {
  private EType[] items;
  private int size;

  /** Creates an empty list. */
  public AList() {
    items = (EType[]) new Object[100];
    size = 0;
  }

  /** Inserts item into given position. */
  @Override
  public void insert(EType x, int position) {
    EType[] newItems = (EType[]) new Object[items.length + 1];

    System.arraycopy(items, 0, newItems, 0, position);
    newItems[position] = x;

    System.arraycopy(items, position, newItems, position + 1, items.length - position);

    items = newItems;
    size++;
  }

  /** Resize the underlying array to the target capacity. */
  private void resize(int capacity) {
    EType[] newItems = (EType[]) new Object[capacity];
    System.arraycopy(items, 0, newItems, 0, size);
    items = newItems;
  }

  /** Inserts an item at the front. */
  @Override
  public void addFirst(EType x) {
    insert(x, 0);
  }

  /** Inserts X into the back of the list. */
  @Override
  public void addLast(EType x) {
    if (size == items.length) {
      resize(size + 1);
    }

    items[size] = x;
    size++;
  }

  /** Gets an item from the front. */
  @Override
  public EType getFirst() {
    return items[0];
  }

  /** Returns the item from the back of the list. */
  public EType getLast() {
    return items[size - 1];
  }

  /** Gets the ith item in the list (0 is the front). */
  public EType get(int i) {
    return items[i];
  }

  /** Returns the number of items in the list. */
  public int size() {
    return size;
  }

  /** Deletes item from back of the list and returns deleted item. */
  public EType removeLast() {
    EType x = getLast();
    items[size - 1] = null;
    size--;
    return x;
  }

  public static void main(String[] args) {
    AList<String> stringArrList = new AList<>();
    stringArrList.addFirst("a");
    stringArrList.addLast("fs");
    stringArrList.addLast("wqr");
    stringArrList.addFirst("as");
    stringArrList.addLast("tdrrt");
    stringArrList.addFirst("trtytyu");
    stringArrList.insert("iiiii", 1);

    stringArrList.print();

    System.out.println("get first: " + stringArrList.getFirst());
    System.out.println("get last: " + stringArrList.getLast());
    System.out.println("get: " + stringArrList.get(2));
    System.out.println("size: " + stringArrList.size());

    System.out.println("remove last: " + stringArrList.removeLast());

    stringArrList.print();

  }
}
