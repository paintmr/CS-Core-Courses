// 把其它三個文件的代碼放到此處，避免非專業Java寫代碼環境出現的“找不到符號”的錯誤。
public class AllInOne {
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

public class Parent<E> {
  private E value;

  public E getValue() {
    return value;
  }

  public void setValue(E value) {
    this.value = value;
  }
}

// 子類也是泛型類，子類和父類的泛型類型要一致
public class ChildFirst<T> extends Parent<T> {
  @Override
  public T getValue() {
    return super.getValue();
  }
}

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
