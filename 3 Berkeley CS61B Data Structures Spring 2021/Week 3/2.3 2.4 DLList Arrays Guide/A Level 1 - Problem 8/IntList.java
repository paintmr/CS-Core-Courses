/**
 * Corn on the Cobb is a IntList Romer who wants to edit the IntList class so
 * that it can help him roam
 * safely. His idea is to write a method dreaming which is a method that adds a
 * number to the end of an
 * IntList. However, there is a catch. The IntList must have a size less than or
 * equal to 3. If the size ever
 * exceeds 3, the first element of the IntList must be removed and the second
 * element should become the
 * new start of the IntList. For example, say we have the following calls
 * 1 a = new I n t L i s t ( ) ;
 * 2 a . dreaming ( 1 ) ; a . dreaming ( 2 ) ; a . dreaming ( 3 ) ; a . dreaming
 * ( 4 ) ;
 * a.first would be 2, a.rest.first would be 3, a.rest.rest.first would be 4
 * equivalent to the IntList 2 → 3 → 4.
 * It is this IntList because 1 is removed when 4 is added since the IntList
 * size would exceed 3.
 * 
 * (a) Complete the IntList class such that it fulfills the above requirements.
 * A reminder that the dreaming method is void.
 * 
 * (b) Corn on the Cobb now wants to test this code to make sure that he does
 * not lose his way in his
 * dreams (that would really suck). Write a basic JUnit test to make sure that
 * your code works as
 * expected.
 * Note: The IntList.list(1, 2, 3,4, 5) would make an int list 1→ 2 → 3 → 4 → 5
 * 
 */
public class IntList {
  public class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int f, IntNode r) {
      item = f;
      next = r;
    }
  }

  private IntNode sentinel;

  private int size;

  public IntList() {
    sentinel = new IntNode(333, null);
    size = 0;
  }

  public IntList(int x) {
    sentinel = new IntNode(333, null);
    sentinel.next = new IntNode(x, null);
    size = 1;
  }

  // public static void main(String[] args) {
  // IntList a = new IntList();
  // a.dreaming(1);
  // a.dreaming(2);
  // a.dreaming(3);
  // a.dreaming(4);
  // // System.out.println(a.toString());

  // a.list(new int[] { 1, 2, 3, 4, 5 });
  // }

  public int size() {
    return size;
  }

  public void dreaming(int n) {
    IntNode in = sentinel;
    if (size() >= 3) {
      // 删除sentinel后的第一个节点
      in.next = in.next.next;
      size--;
    }
    // 在最后添加一个节点
    size++;
    while (in.next != null) {
      in = in.next;
    }
    in.next = new IntNode(n, null);
  }

  public String list(int[] n) {
    for (int i = 0; i < n.length; i++) {
      dreaming(n[i]);
    }
    String toPrint = "";
    IntNode in = sentinel;
    while (in.next != null) {
      toPrint += in.next.item + " -> ";
      in = in.next;
    }
    // 去掉最后的→
    toPrint = toPrint.substring(0, toPrint.length() - 4);
//    System.out.println(toPrint);
    return toPrint;
  }
}