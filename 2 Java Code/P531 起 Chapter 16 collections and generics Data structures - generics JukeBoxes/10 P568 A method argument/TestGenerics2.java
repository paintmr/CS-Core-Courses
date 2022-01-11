import java.util.*;

public class TestGenerics2 {
  public static void main(String[] args) {
    new TestGenerics2().go();
  }

  public void go() {
    // A simple change from Animal[] to ArrayList<Animal>.
    ArrayList<Animal> animals = new ArrayList<Animal>();
    // We have to add one at a time since there’s no shortcut syntax like there is
    // for array creation.
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Dog());
    // This is the same code, except now the “animals” variable refers to an
    // ArrayList instead of array
    takeAnimals(animals);
  }

  // The method now takes an ArrayList instead of an array, but everything else is
  // the same.Remember,that for loop syntax works for both arrays and collections.
  public void takeAnimals(ArrayList<Animal> animals) {
    for (Animal a : animals) {
      a.eat();
    }
  }
}

// The simplified Animal class hierarchy
abstract class Animal {
  void eat() {
    System.out.println("animal eating");
  }
}

class Dog extends Animal {
  void bark() {
  };
}

class Cat extends Animal {
  void meow() {
  };
}

// 运行结果：
// animal eating
// animal eating
// animal eating