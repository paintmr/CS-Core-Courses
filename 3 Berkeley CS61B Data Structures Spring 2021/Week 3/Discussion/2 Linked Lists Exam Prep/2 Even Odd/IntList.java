public class IntList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    this.first = f;
    this.rest = r;
  }

  public static void main(String[] args) {
    IntList lst = new IntList(5, null);
    lst = new IntList(2, lst);
    lst = new IntList(4, lst);
    lst = new IntList(1, lst);
    lst = new IntList(3, lst);
    lst = new IntList(0, lst);
    // lst.listPrt(lst);
    lst.evenOdd(lst);
    lst.listPrt(lst);
  }

  public void evenOdd(IntList lst) {
    if (lst == null || lst.rest == null) {
      return;
    }
    IntList oddList = lst.rest;
    IntList second = lst.rest;
    while (lst.rest != null && oddList.rest != null) {
      lst.rest = lst.rest.rest;
      oddList.rest = oddList.rest.rest;
      lst = lst.rest;
      oddList = oddList.rest;
    }
    lst.rest = second;
  }

  public void listPrt(IntList lst) {
    String lstPrt = first + "->";
    while (rest != null) {
      lstPrt += rest.first + "->";
      rest = rest.rest;
    }
    lstPrt = lstPrt.substring(0, lstPrt.length() - 2);
    System.out.println(lstPrt);
  }

}
