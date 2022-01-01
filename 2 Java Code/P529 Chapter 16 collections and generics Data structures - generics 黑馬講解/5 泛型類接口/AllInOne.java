public class AllInOne {
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

public interface Generator<T> {
  T getKey();
}

public class Apple implements Generator<String> {
  @Override
  public String getKey() {
    return "I am implementing Generator";
  }
}

public class Pear<T, E> implements Generator<T> {
  private T key;
  private E value;

  public Pear(T key, E value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public T getKey() {
    return key;
  }

  public E getValue() {
    return value;
  }

}
