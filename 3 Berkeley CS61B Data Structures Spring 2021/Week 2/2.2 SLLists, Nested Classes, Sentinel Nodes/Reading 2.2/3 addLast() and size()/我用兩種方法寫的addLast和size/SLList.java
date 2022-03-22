public class SLList {
  public static class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

  private IntNode first;

  public SLList(int i) {
    first = new IntNode(i, null);
  }

  public void addFirst(int i) {
    first = new IntNode(i, first);
  }

  public int getFirst() {
    return first.item;
  }

  public void addLastIterative(int i) {
    IntNode iNode = first;
    while (iNode.next != null) {
      iNode = iNode.next;
    }
    iNode.next = new IntNode(i, null);
  }

  public void addLastRecrusive(int i) {
    addLastRecrusive(i, first);
  }

  private static void addLastRecrusive(int i, IntNode iNode) {
    // 必须用if else的结构，否则每次回调，都会执行iNode.next = new IntNode(i, null);，导致最后的结果出错。
    if (iNode != null && iNode.next != null) {
      addLastRecrusive(i, iNode.next);
    } else {
      iNode.next = new IntNode(i, null);
    }
  }

  public int sizeIterative() {
    IntNode intNode = first;
    int size = 0;
    while (intNode != null) {
      size++;
      intNode = intNode.next;
    }
    return size;
  }

  public int sizeRecursive() {
    return sizeRecursive(first);
  }

  private static int sizeRecursive(IntNode intNode) {
    if (intNode == null) {
      return 0;
    } else {
      return 1 + sizeRecursive(intNode.next);
    }
  }

  public static void main(String[] args) {
    SLList mylst = new SLList(10);
    mylst.addFirst(20);
    mylst.addLastIterative(30);
    mylst.addLastRecrusive(40);

    System.out.println(mylst.sizeIterative());
    System.out.println(mylst.sizeRecursive());
  }
}