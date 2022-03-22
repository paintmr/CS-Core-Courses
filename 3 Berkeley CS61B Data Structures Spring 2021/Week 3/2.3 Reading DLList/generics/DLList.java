// 這不是導師的代碼。是我自己寫的。
public class DLList<eType> {
  public class IntNode {
    public eType item;
    public IntNode prev;
    public IntNode next;

    public IntNode(eType i, IntNode p, IntNode n) {
      item = i;
      prev = p;
      next = n;
    }
  }

  public IntNode sentinel;
  public int size;

  public DLList() {
    IntNode sentinel = new IntNode(null, null, null);
    sentinel.next = sentinel;
    sentinel.prev = sentinel;
    size = 0;
  }

  public DLList(eType i) {
    IntNode sentinel = new IntNode(null, null, null);
    sentinel.next = new IntNode(i, sentinel, sentinel);
    sentinel.prev = new IntNode(i, sentinel, sentinel);
    size = 1;
  }
}