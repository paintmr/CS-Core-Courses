public class SLList<EType> {
  private class Node {
    public EType item;
    public Node next;

    public Node(EType i, Node n) {
      item = i;
      next = n;
    }
  }

  /**
   * Having a sentinel simplifies out addLast method. No need for a special case
   * to check if sentinel is null (since it is never null).
   */
  private Node sentinel;
  private int size;

  public SLList() {
    sentinel = new Node(null, null);
    size = 0;
  }

  public SLList(EType x) {
    sentinel = new Node(null, null);
    sentinel.next = new Node(x, null);
    size = 1;
  }

  /** Adds x to the front of the list */
  public void addFirst(EType x) {
    sentinel.next = new Node(x, sentinel.next);
    size++;
  }

  /** Returns the first item in the list */
  public EType getFirst() {
    return sentinel.next.item;
  }

  /** Adds an item to the end of the list. */
  public void addLast(EType x) {
    size++;

    Node p = sentinel;

    /* Advance p to the end of the list. */
    while (p.next != null) {
      p = p.next;
    }
    p.next = new Node(x, null);
  }

  /* Returns the size of the list starting at Node p. */
  public int size() {
    return size;
  }

  /** Returns the ith item in the list. */
  public EType get(int i) {
    return get(i, sentinel.next);
  }

  private EType get(int i, Node p) {
    if (i == 0) {
      return p.item;
    }
    return get(i - 1, p.next);
  }
}
