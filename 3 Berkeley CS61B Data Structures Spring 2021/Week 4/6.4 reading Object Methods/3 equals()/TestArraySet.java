import java.util.Iterator;

public class TestArraySet {
  public static void main(String[] args) {
    ArraySet<Integer> arrS = new ArraySet<>();
    arrS.add(5);
    arrS.add(25);
    arrS.add(35);
    System.out.println(arrS);

    ArraySet<Integer> arrS2 = new ArraySet<>();
    arrS2.add(5);
    arrS2.add(25);
    arrS2.add(35);
    System.out.println(arrS2);

    System.out.println(arrS.equals(arrS2));
  }
}
