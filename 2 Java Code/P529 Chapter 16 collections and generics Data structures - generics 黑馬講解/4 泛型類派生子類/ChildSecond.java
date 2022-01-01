// 子類不是泛型類，父類要明確泛型的數據類型
public class ChildSecond extends Parent<Integer> {
  @Override
  public Integer getValue() {
    return super.getValue();
  }

  @Override
  public void setValue(Integer value) {
    super.setValue(value);
  }
}
