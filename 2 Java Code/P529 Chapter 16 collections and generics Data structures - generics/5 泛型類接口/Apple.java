/**
 * 實現泛型接口的類不是泛型類，需要明確實現泛型接口的數據類型。
 */

public class Apple implements Generator<String> {
  @Override
  public String getKey() {
    return "I am implementing Generator";
  }
}
