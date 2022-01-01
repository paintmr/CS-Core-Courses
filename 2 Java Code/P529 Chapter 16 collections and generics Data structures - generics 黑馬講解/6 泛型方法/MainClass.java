import java.util.ArrayList;

public class MainClass {
  public static void main(String[] args) {
    ProductGetter<Integer> productGetter = new ProductGetter<>();

    ArrayList<String> strList = new ArrayList<>();
    strList.add("iPhone");
    strList.add("MacBook Pro");
    strList.add("car");
    // 調用泛型方法。泛型方法的類型在調用方法的時候指定。不必和類一樣。
    String product1 = productGetter.getProduct(strList);
    System.out.println(product1 + "\t" + product1.getClass().getSimpleName());

    ArrayList<Integer> intList = new ArrayList<>();
    intList.add(100000);
    intList.add(200000);
    intList.add(300000);
    // 調用泛型方法。泛型方法的類型在調用方法的時候指定。不必和類一樣。
    Integer product2 = productGetter.getProduct(intList);
    System.out.println(product2 + "\t" + product2.getClass().getSimpleName());

    System.out.println("調用多個泛型類型的靜態方法：");
    ProductGetter.printType(100, "java", true);

    System.out.println("使用泛型可變參數：");
    ProductGetter.print(1, 2, 3, 4, 5);
    ProductGetter.print("a", "b", "c");
  }
}
