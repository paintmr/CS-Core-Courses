import java.util.*;

public class TestGenerics1 {
  public static void main(String[] args) {
    new TestGenerics1().go();
  }

  public void go() {
    // TestGenerics1
    Animal[] animals = { new Dog(), new Cat(), new Dog() };
    // Declare and create a Dog array, that holds only Dogs (the compiler won’t let
    // you put a Cat in).
    Dog[] dogs = { new Dog(), new Dog(), new Dog() };
    // Call takeAnimals(), using both array types as arguments...
    takeAnimals(animals);
    takeAnimals(dogs);
  }

  // The crucial point is that the takeAnimals() method can take an Animal[] or a
  // Dog[], since Dog IS-A Animal. Polymorphism in action.
  public void takeAnimals(Animal[] animals) {
    for (Animal a : animals) {
      // Remember, we can call ONLY the methods declared in type animal, since the
      // animals parameter is of type Animal array, and we didn’t do any casting.
      // (What would we cast it to? That array might hold both Dogs and Cats.)
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
// animal eating
// animal eating
// animal eating