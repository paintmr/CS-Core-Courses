package generictest;

public class MainClass {
  public static void main(String[] args) {

    Generic<String> myStrGeneric = new Generic<>("abc");
    String key1 = myStrGeneric.getKey();
    System.out.println("key1:" + key1); // key1:abc

    Generic<Integer> myIntGeneric = new Generic<>(100);
    Integer key2 = myIntGeneric.getKey();
    System.out.println("key2:" + key2); // key2:100

    // 泛型類在創建對象的時候，如果沒有指定類型，默認類型為Object
    Generic generic = new Generic("ABC")

    // 泛型類不支持基本數據類型。泛型的類型參數只能是類類型。
    // Generic<int> generic4 = new Generic<>(100);

    // 同一泛型類，根據不同的數據類型創建的對象，本質上是同一類型。在這個例子裡，就是class Generic.
    System.out.println(myStrGeneric.getClass() == myIntGeneric.getClass()); // true

  }
}
