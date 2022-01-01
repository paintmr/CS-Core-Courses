import java.util.Comparator;
import java.util.TreeSet;
import java.lang.reflect.Constructor;

public class AllInOne {
  public static void main(String[] args) {
    // 創建TreeSet時，可以指定比較器。
    TreeSet<Cat> treeSet = new TreeSet<>(new Comparator2());
    treeSet.add(new Cat("Zhang", 20));
    treeSet.add(new Cat("Li", 25));
    treeSet.add(new Cat("Wang", 23));
    treeSet.add(new Cat("Zhao", 30));

    for (Cat cat : treeSet) {
      System.out.println(cat);
    }
  }
}

public class Aminal {
  public String name;

  public Animal(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name= " + name + "\'" +
        '}';
  }
}

public class Cat extends Animal {
  public int age;

  public Cat(String name, int age) {
    super(name);
    this.age = age;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "age=" + age +
        ",name='" + name + "\'" +
        "}";
  }
}

public class MiniCat extends Cat {
  public int level;

  public MiniCat(String name, int age, int level) {
    super(name, age);
    this.level = level;
  }

  @Override
  public String toString() {
    return "MiniCat{" +
        "level=" + level +
        "age=" + age +
        ",name='" + name + "\'" +
        "}";
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