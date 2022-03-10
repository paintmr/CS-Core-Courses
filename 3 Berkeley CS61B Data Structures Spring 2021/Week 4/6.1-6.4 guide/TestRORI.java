import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TestRORI {
  @Test
  public void TestRORI() {
    ReverseOddDigit odi = new ReverseOddDigit(12345770);
    for (int i : odi) {
      System.out.println(i);
    }
    List<Integer> odiLst = IterableUtils.toList(odi);
    List<Integer> expectedLst = List.of(7, 7, 5, 3, 1);
    Assert.assertEquals(expectedLst, odiLst);
  }
}
