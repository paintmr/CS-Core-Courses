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
  public T getProduct() {
    product = list.get(random.nextInt(list.size()));
    return product;
  }
}