// 這不是導師的代碼。是我自己寫的。
public class DLList<eType> {

  public class Node {
    public eType item;
    public Node prev;
    public Node next;

    public Node(eType e, Node p, Node n) {
      item = e;
      prev = p;
      next = n;
    }
  }

  private final Node sentinel = new Node(null, null, null);

  private int size;

  public DLList() {
    sentinel.next = sentinel;
    sentinel.prev = sentinel;
    size = 0;
  }

  public DLList(eType e) {
    sentinel.next = new Node(e, sentinel, sentinel);
    sentinel.prev = sentinel.next;
    size = 1;
  }

  public void addFirst(eType e) {
    sentinel.next = new Node(e, sentinel, sentinel.next);
    sentinel.next.next.prev = sentinel.next;
  }

  public void addLast(eType e) {
    sentinel.prev.next = new Node(e, sentinel.prev, sentinel);
    sentinel.prev = sentinel.prev.next;
  }

  public static void main(String[] args) {
    DLList<Integer> myDLst = new DLList<>();
    // myDLst.addFirst(10);
    // myDLst.addFirst(20);
    myDLst.addLast(50);
    myDLst.addLast(60);

    DLList<Integer> myDLst2 = new DLList<>(100);
    // myDLst2.addFirst(200);
    // myDLst2.addFirst(300);
    myDLst2.addLast(500);
    myDLst2.addLast(600);
  }
}