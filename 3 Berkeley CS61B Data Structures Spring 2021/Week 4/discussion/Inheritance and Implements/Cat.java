public class Cat extends Animal {
  public Cat(String name, int age) {
    super(name, age);
    // 下面兩種寫法都可以
    this.noise = "Meow!(this.noise)";
//     noise = "Meow!(noise)";
  }

  @Override
  public void greet() {
    System.out.println("Cat " + name + " says: " + this.noise);
  }

  public void play(String expr) {
    System.out.println("Woo it is so much fun being a cat!" + expr);
  }
}