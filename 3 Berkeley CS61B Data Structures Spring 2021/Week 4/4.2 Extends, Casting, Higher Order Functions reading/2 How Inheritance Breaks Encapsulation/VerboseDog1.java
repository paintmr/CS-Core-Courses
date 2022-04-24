public class VerboseDog1 extends Dog1 {
  @Override
  public void barkMany(int N) {
    System.out.print("VerboseDog1:");
    for (int i = 0; i < N; i++) {
      bark();
    }
  }

  public static void main(String[] args) {
    VerboseDog1 vd1 = new VerboseDog1();
    vd1.barkMany(3);// VerboseDog1:barkbarkbark
  }
}
