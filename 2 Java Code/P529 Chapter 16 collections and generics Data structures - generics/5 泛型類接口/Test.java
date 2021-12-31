public class Test {
  public static void main(String[] args) {
    Apple apple = new Apple();
    String key = apple.getKey();
    System.out.println(key);

    System.out.println("------------------------");

    Pear<String, Integer> pear = new Pear<>("Zhang", 1000);
    String key1 = pear.getKey();
    Integer value1 = pear.getValue();
    System.out.println(key1 + "=" + value1);
  }
}
