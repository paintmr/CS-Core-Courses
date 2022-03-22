// 這不是導師的代碼。是我自己寫的。
public class DLList {
  public static class IntNode {
    public int item;
    public IntNode prev;
    public IntNode next;

    public IntNode(int i, IntNode p, IntNode n) {
      item = i;
      prev = p;
      next = n;
    }
  }

  public IntNode sentinel;
  public int size;

  public DLList() {
    IntNode sentinel = new IntNode(999, null, null);
    sentinel.next = sentinel;
    sentinel.prev = sentinel;
    size = 0;
  }

  public DLList(int i) {
    IntNode sentinel = new IntNode(999, null, null);
    sentinel.next = new IntNode(i, sentinel, sentinel);
    sentinel.prev = new IntNode(i, sentinel, sentinel);
    size = 1;
  }
}