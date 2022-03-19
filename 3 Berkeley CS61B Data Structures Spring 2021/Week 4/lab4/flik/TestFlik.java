import org.junit.Test;

import flik.Flik;

import static org.junit.Assert.*;

public class TestFlik {
  @Test
  public void testIsSameNumber() {
    Integer a = 3;
    Integer b = 3;
    Integer c = 6;
    Integer d = 130;
    Integer e = 130;

    Boolean eqAB = Flik.isSameNumber(a, b);
    Boolean eqAC = Flik.isSameNumber(a, c);
    Boolean eqDE = Flik.isSameNumber(d, e);

    assertTrue(eqAB);
    assertFalse(eqAC);
    System.out.println(eqDE); // false
  }
}