public class SLList<EType> implements List61B<EType> {
  private class Node {
    public EType item;
    public Node next;

    public Node(EType i, Node n) {
      item = i;
      next = n;
    }
  }

  /** The first item (if it exists) is at sentinel.next. */
  private Node sentinel;
  private int size;

  /** Creates an empty SLList. */
  public SLList() {
    sentinel = new Node(null, null);
    size = 0;
  }

  public SLList(EType x) {
    sentinel = new Node(null, null);
    sentinel.next = new Node(x, null);
    size = 1;
  }

  /**
   * Inserts the item into the given position in the list. If position is greater
   * than the size of the list, inserts at the end instead.
   */
  public void insert(EType item, int position) {
    Node p = sentinel;
    while (position > 0 && p.next != null) {
      position--;
      p = p.next;
    }
    Node newNode = new Node(item, p.next);
    p.next = newNode;
    size++;
  }

  /** Adds x to the front of the list. */
  public void addFirst(EType x) {
    sentinel.next = new Node(x, sentinel.next);
    size++;
  }

  /** Adds x to the end of the list. */
  public void addLast(EType x) {
    size++;
    Node p = sentinel;
    /** Advance p to the end of the list. */
    while (p.next != null) {
      p = p.next;
    }
    p.next = new Node(x, null);
  }

  /** Returns the first item in the list */
  public EType getFirst() {
    return sentinel.next.item;
  }

  /** Returns the back node of our list. */
  public EType getLast() {
    Node back = getLastNode();
    return back.item;
  }

  private Node getLastNode() {
    Node p = sentinel;
    /** Advance p to the end of the list. */
    while (p.next != null) {
      p = p.next;
    }
    return p;
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

  /** Returns the size of the list. */
  public int size() {
    return size;
  }

  /**
   * Deletes and returns the last item. The return value is the item of the node
   * that has been removed.
   */
  public EType removeLast() {
    Node back = getLastNode();
    if (back == sentinel) {
      return null;
    }

    Node p = sentinel;
    while (p.next != back) {
      p = p.next;
    }
    p.next = null;
    return back.item;
  }

  @Override
  public void print() {
    System.out.println("THIS IS THE OVERRIDDEN VERSION.");
    Node p = sentinel.next;
    while (p != null) {
      System.out.print(p.item + " ");
      p = p.next;
    }
    System.out.println(" ");
    System.out.println("----------");
  }

  public static void main(String[] args) {
    SLList<Integer> L = new SLList<>();
    L.addFirst(2);
    L.addLast(5);
    L.addFirst(3);
    L.addLast(6);
    L.addFirst(7);
    L.addLast(9);
    L.print();

    L.insert(99, 3);
    L.print();

    System.out.println("L.getFirst(): " + L.getFirst());

    System.out.println("L.getLast(): " + L.getLast());

    System.out.println("L.get(5): " + L.get(5));

    System.out.println("L.size(): " + L.size());

    L.removeLast();
    L.print();

  }

}
