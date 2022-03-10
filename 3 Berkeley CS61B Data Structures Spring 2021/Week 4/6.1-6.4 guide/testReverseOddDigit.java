import java.util.Iterator;

public class testReverseOddDigit {
  public static void main(String[] args) {
    ReverseOddDigit odi = new ReverseOddDigit(12345770);
    Iterator<Integer> odiIterator = odi.iterator();
    while (odiIterator.hasNext()) {
      System.out.println(odiIterator.next());
    }
  }
}
