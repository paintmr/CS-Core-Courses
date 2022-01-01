package generictest;

/**
 * <T> 泛型標識
 * T 創建對象的時候指定具體的數據類型
 */
public class Generic<T> {

  private T key; // 成員變量

  public Generic(T key) { // 構造方法
    this.key = key;
  }

  public T getKey() {
    return key;
  }

  public void setKey(T key) {
    this.key = key;
  }

  // Override
  public String toString() {
    return "Generic{" +
        "key=" + key +
        '}';
  }
}