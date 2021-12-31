import java.util.ArrayList;
import java.util.Random;

public class AllInOne {
  public static void main(String[] args) {
    ProductGetter<Integer> productGetter = new ProductGetter<>();

    ArrayList<String> strList = new ArrayList<>();
    strList.add("iPhone");
    strList.add("MacBook Pro");
    strList.add("car");
    // 調用泛型方法。泛型方法的類型在調用方法的時候指定。不必和類一樣。
    String product1 = productGetter.getProduct(strList);
    System.out.println(product1 + "\t" + product1.getClass().getSimpleName()); // car String

    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(100000);
    intList.add(200000);
    intList.add(300000);
    // 調用泛型方法。泛型方法的類型在調用方法的時候指定。不必和類一樣。
    Integer product2 = productGetter.getProduct(intList);
    System.out.println(product2 + "\t" + product2.getClass().getSimpleName()); // 300000 String

    System.out.println("調用多個泛型類型的靜態方法：");
    ProductGetter.printType(100, "java", true);
    // 打印結果
    // 100 Integer
    // java String
    // true Boolean

    System.out.println("使用泛型可變參數：");
    ProductGetter.print(1, 2, 3, 4, 5);
    ProductGetter.print("a", "b", "c");
    /**
     * 打印結果
     * 1
     * 2
     * 3
     * 4
     * 5
     * a
     * b
     * c
     */
  }
}

/**
 * 抽獎器
 * 
 * @param <T>
 */

public class ProductGetter<T> {
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
  public T getProduct() { // 這是個成員方法，只不過其返回值類型採用了泛型類的泛型類型。
    product = list.get(random.nextInt(list.size()));
    return product;
  }

  // 這是泛型方法
  /**
   * @param <E>  泛型標識，具體類型，調用方法時指定
   * @param list 參數
   * @return
   */
  public <E> E getProduct(ArrayList<E> list) {
    return list.get(random.nextInt(list.size()));
  }

  /**
   * 靜態的泛型方法，採用多個泛型類型
   * 
   * @param <T>
   * @param <E>
   * @param <K>
   * @param t
   * @param e
   * @param k
   */
  public static <T, E, K> void printType(T t, E e, K k) {
    System.out.println(t + "\t" + t.getClass().getSimpleName());
    System.out.println(e + "\t" + e.getClass().getSimpleName());
    System.out.println(k + "\t" + k.getClass().getSimpleName());
  }

  /**
   * 定義泛型可變參數
   * 
   * @param <E>
   * @param e
   */
  public static <E> void print(E... e) {
    for (int i = 0; i < e.length; i++) {
      System.out.println(e[i]);
    }
  }
}