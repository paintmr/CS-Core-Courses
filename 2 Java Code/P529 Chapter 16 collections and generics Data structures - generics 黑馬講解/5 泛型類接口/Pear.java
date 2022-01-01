/**
 * 如果泛型接口的實現類是一個泛型類，要保證實現接口的泛型類泛型標識包含泛型接口的泛型標識
 */

public class Pear<T, E> implements Generator<T> {
  private T key;
  private E value;

  public Pear(T key, E value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    return key;
  }

  public E getValue() {
    return value;
  }

}
