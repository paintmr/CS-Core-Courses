import static org.junit.Assert.*;
import org.junit.Test;

public class TestIntList {
  @Test
  public void testDreaming() {
    IntList L = new IntList();
    String result = L.list(new int[] { 1, 2, 3, 4, 5 });
    assertEquals("3 -> 4 -> 5", result);
  }
}
