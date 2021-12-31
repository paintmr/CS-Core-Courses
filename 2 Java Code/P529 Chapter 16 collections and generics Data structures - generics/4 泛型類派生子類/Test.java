public class Test {
  public static void main(String[] args) {
    ChildFirst<String> childFirst = new ChildFirst<>();
    childFirst.setValue("abc");
    String value1 = childFirst.getValue();
    System.out.println(value1);

    System.out.println("------------------------");

    ChildSecond childSecond = new ChildSecond();
    childSecond.setValue(100);
    Integer value2 = childSecond.getValue();
    System.out.println(value2);
  }
}
