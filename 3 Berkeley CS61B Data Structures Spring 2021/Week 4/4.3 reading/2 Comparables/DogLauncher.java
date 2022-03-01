public class DogLauncher {
  public static void main(String[] args) {
    Dog[] dogs = { new Dog("Elyse", 3), new Dog("Sture", 9), new Dog("Artemesios", 15) };
    Dog maxDog = (Dog)Maximizer.max(dogs);
    maxDog.bark();
  }
}
