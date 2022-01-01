import java.util.Comparator;
import java.util.TreeSet;

public class Test {
  public static void main(String[] args) {
    // 創建TreeSet時，可以指定比較器。
    TreeSet<Cat> treeSet = new TreeSet<>(new Comparator2());
    treeSet.add(new Cat(name:"Zhang", age:20));
    treeSet.add(new Cat(name:"Li", age:25));
    treeSet.add(new Cat(name:"Wang", age:23));
    treeSet.add(new Cat(name:"Zhao", age:30));

    for(Cat cat : treeSet) {
      System.out.println(cat);
    }
  }
}

// 下面是3个外部比较器
class Comparator1 implements Comparator<Animal> {
  public int compare(Animal o1, Animal o2) {
    return o1.name.compareTo(o2.name);
  }
}

class Comparator2 implements Comparator<Cat> {
  public int compare(Cat o1, Cat o2) {
    return o1.age - o2.age;
  }
}

class Comparator3 implements Comparator<MiniCat> {
  public int compare(MiniCat o1, MiniCat o2) {
    return o1.level - o2.level;
  }
}