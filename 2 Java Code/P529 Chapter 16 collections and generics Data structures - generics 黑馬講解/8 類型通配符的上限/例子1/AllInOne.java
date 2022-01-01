public class AllInOne {
  public static void main(String[] args) {
    Box<Number> box1 = new Box<>();
    box1.setFirst(100);
    showBox(box1);

    // 再寫個Integer，這時showBox(Box<Number> box)無法正常使用。
    Box<Integer> box2 = new Box<>();
    box2.setFirst(200);
    showBox(box2);
  }

  // 定義一個方法，參數是一個泛型類。泛型類的類型是Number
  // public static void showBox(Box<Number> box) {
  // Number first = box.getFirst();
  // System.out.println(first);
  // }

  // 如果要同時滿足Box<Number> box1和Box<Integer> box2，上面的showBox(Box<Number>
  // box)無法完成這個任務，所以用下面的方法。？是泛型通配符。
  // public static void showBox(Box<?> box) {
  // Object first = box.getFirst();
  // System.out.println(first);
  // }

  // 用泛型通配符的上限來改寫上述代碼。? extends
  // Number表示這裡只能傳Number和Number的子類。這裡傳Number和Integer都可以。
  public static void showBox(Box<? extends Number> box) {
    Number first = box.getFirst();
    System.out.println(first);
  }
}

public class Box<E> {
  private E first;

  public E getFirst() {
    return first;
  }

  public void setFirst(E first) {
    this.first = first;
  }
}