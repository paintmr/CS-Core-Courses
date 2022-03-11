import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TestRORI {
  @Test
  public void TestRORI() {
    ReverseOddDigit odi = new ReverseOddDigit(12345770);
//    List<Integer> odiLst = IterableUtils.toList(odi); //这行代码返回的是空List
    // 把上面的代码直接写在这个class里面
    List<Integer> odiLst = new ArrayList<>();
    for (Integer i : odi) {
      odiLst.add(i);
    }

    List<Integer> expectedLst = List.of(7, 7, 5, 3, 1);
    Assert.assertEquals(expectedLst, odiLst);
  }
}
