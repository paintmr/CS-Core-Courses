package generictest;

public class MainClass {
  public static void main(String[] args) {
    System.out.println(new Generic<String>("abc"));

    // Generic<String> myStrGeneric = new Generic<String>("abc");
    // String key1 = myStrGeneric.getKey();
    // System.out.println("key1:" + key1);
  }
}
