import java.util.ArrayList;

/**
 * Test
 */
public class Test {
  public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();
    ArrayList<Cat> cats = new ArrayList<>();
    ArrayList<MiniCat> miniCats = new ArrayList<>();

    showAnimal(animals);
    showAnimal(cats);
    // showAnimal(miniCats); // 錯誤代碼

  }

  /**
   * 泛型下限通配符傳遞的集合類型只能是Cat或Cat的父類類型。
   * 
   * @param list
   */
  public static void showAnimal(List<? super Cat> list) {
    // 可以用add()。這和上限通配符不同。
    // 雖然可以用add()，但是不保證數據滿足約束要求。
    list.add(new Cat());
    list.add(new MiniCat());
    for (Object o : list) {
      System.out.println(o);
    }
  }
}