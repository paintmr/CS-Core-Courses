import java.util.ArrayList;

/**
 * Test
 */
public class Test {
  public static void main(String[] args) {
    // ArrayList<Animal> animals = new ArrayList<>();// 錯誤代碼。
    ArrayList<Cat> cats = new ArrayList<>();
    ArrayList<MiniCat> miniCats = new ArrayList<>();

    // cats.addAll(animals);// 錯誤代碼。addAll()採用了上限類型通配符
    cats.addAll(cats);
    cats.addAll(miniCats);

    // showAnimal(animals); // 錯誤代碼。因為泛型上限通配符傳遞的集合類型只能是Cat或Cat的子類類型。
    showAnimal(cats);
    showAnimal(miniCats);

  }

  /**
   * 泛型上限通配符傳遞的集合類型只能是Cat或Cat的子類類型。
   * 
   * @param list
   */
  public static void showAnimal(ArrayList<? extends Cat> list) {
    // 泛型上限通配符不允許往list中添加內容，因為這裡不確定到底傳的是Cat還是Cat的子級
    // list.add(new Animal()); // 錯誤代碼
    // list.add(new Cat()); // 錯誤代碼
    // list.add(new MiniCat()); // 錯誤代碼

    for (int i = 0; i < list.size(); i++) {
      Cat cat = list.get(i);
      System.out.println(cat);
    }
  }
}