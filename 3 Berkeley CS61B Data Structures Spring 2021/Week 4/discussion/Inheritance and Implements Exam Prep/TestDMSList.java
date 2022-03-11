public class TestDMSList {
  public static void main(String[] args) {
    DMSList lst = new DMSList();
    lst.insertFront(1);
    lst.insertFront(2);
    int lstMax = lst.max();
    System.out.println(lstMax); // 2
  }
}
