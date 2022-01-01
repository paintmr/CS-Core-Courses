import java.util.ArrayList;
import java.util.Random;

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