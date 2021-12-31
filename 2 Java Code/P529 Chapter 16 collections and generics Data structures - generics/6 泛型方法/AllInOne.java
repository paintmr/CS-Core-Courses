import java.util.ArrayList;
import java.util.Random;

// 這個類把MainClass.java和ProductGetters.java中的代碼寫在了一起，便於在沒有專門的Java寫代碼工具的情況下編譯，查看代碼是否寫對了。
public class TwoClassesInOne<T> {
  public static void main(String[] args) {
    // 創建抽獎器對象，指定數據類型
    TwoClassesInOne<String> stringTwoClassesInOne = new TwoClassesInOne<>();

    // 給抽獎器填充獎品
    String[] strPrize = { "iPhone", "MacBook Pro", "microwave oven", "car", "computer" };
    for (int i = 0; i < strPrize.length; i++) {
      stringTwoClassesInOne.addProduct(strPrize[i]);
    }

    // 抽獎
    String productl = stringTwoClassesInOne.getProduct();
    System.out.println("Congratulations! You've got: " + productl);

    System.out.println("---------------------------------------------");

    // 創建抽獎器對象，指定數據類型
    TwoClassesInOne<Integer> integerTwoClassesInOne = new TwoClassesInOne<>();

    // 給抽獎器填充獎品
    Integer[] intPrize = { 10000, 100000, 50000, 30000, 60000 };
    for (int i = 0; i < intPrize.length; i++) {
      integerTwoClassesInOne.addProduct(intPrize[i]);
    }

    // 抽獎
    Integer prize = integerTwoClassesInOne.getProduct();
    System.out.println("Congratulations! You've got: " + prize);
  }

  Random random = new Random();
  // 獎品
  private T product;

  // 獎品集合
  ArrayList<T> list = new ArrayList<>();

  // 添加獎品
  public void addProduct(T t) {
    list.add(t);
  }

  // 抽獎，獲取獎品
  public T getProduct() {
    product = list.get(random.nextInt(list.size()));
    return product;
  }
}
