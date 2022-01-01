// 子類也是泛型類，子類和父類的泛型類型要一致
public class ChildFirst<T> extends Parent<T> {
  @Override
  public T getValue() {
    return super.getValue();
  }
}
