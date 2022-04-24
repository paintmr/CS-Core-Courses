import java.util.Comparator;

public class DogLauncher {
  public static void main(String[] args) {
    Dog[] dogs = { new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("Artemesios", 15) };
    Dog maxDog = (Dog) Maximizer.max(dogs);
    maxDog.bark();

    Comparator<Dog> nc = Dog.getNameComparator();
    if (nc.compare(dogs[0], dogs[1]) > 0) { // If dogs[0] comes later than dogs[1] in the alphabet
      dogs[0].bark();
    } else {
      dogs[1].bark();
    }
  }
}
