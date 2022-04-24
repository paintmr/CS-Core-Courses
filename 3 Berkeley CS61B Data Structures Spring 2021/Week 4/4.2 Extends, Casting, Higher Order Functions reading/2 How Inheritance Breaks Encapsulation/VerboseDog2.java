public class VerboseDog2 extends Dog2 {
  @Override
  public void barkMany(int N) {
    System.out.print("VerboseDog2:");
    for (int i = 0; i < N; i++) {
      bark();
    }
  }

  public static void main(String[] args) {
    VerboseDog2 vd2 = new VerboseDog2();
    vd2.barkMany(3); // Exception in thread "main" java.lang.StackOverflowError. the program gets
                     // caught in an infinite loop. The call to bark() will call barkMany(1), which
                     // makes a call to bark(), repeating the process infinitely many times.
  }
}
