import java.util.*;

import org.junit.Assert;
import org.junit.Test;

public class testListsEqual {

  // 测试两个List是否相等
  @Test
  public void testEq() {
    List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5);
    Assert.assertEquals(list1, list2);
  }
}