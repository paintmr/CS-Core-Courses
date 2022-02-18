public class SpeedTestAList {
  public static void main(String[] args) {
    AList<String> L = new AList<>();
    int i = 0;
    while (i < 100000) {
      L.addLast("aaa");
      i++;
    }
  }
}
