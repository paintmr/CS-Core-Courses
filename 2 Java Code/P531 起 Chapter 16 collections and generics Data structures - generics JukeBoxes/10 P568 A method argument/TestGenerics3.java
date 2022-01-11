import java.util.*;

public class TestGenerics3 {
  public static void main(String[] args) {
    new TestGenerics3().go();
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

    // Make a Dog ArrayList and put a couple of dogs in.
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    takeAnimals(dogs); // 【This will not work!】

  }

  // The method now takes an ArrayList instead of an array, but everything else is
  // the same.Remember,that for loop syntax works for both arrays and collections.
  // If you declare a method to take ArrayList<Animal> it can take ONLY an
  // ArrayList<Animal>, not ArrayList<Dog> or ArrayList<Cat>.
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
// It will not work!