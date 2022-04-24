import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

public class LengthComparator implements NamingEnumeration {

  public static void main(String[] args) {
    String[][] myTwoDStrArr = {
        { null, null, null, null, null, null },
        { null, "a", "ca", "", "ca", null },
        { null, "a", null, "cat", "a", null },
        { null, "a", "cat", "cat", "dogs", null },
        { null, null, null, null, null, null }
    };
    String[][] stepResult = LengthComparator.step(myTwoDStrArr);
    System.out.println("done");
  }

  public static int compare(String s1, String s2) {
    if (s1 == null && s2 != null) {
      return -1;
    } else if (s1 == null && s2 == null) {
      return 0;
    } else if (s1 != null && s2 == null) {
      return 1;
    } else {
      if (s1.length() < s2.length()) {
        return -1;
      } else if (s1.length() == s2.length()) {
        return 0;
      } else {
        return 1;
      }
    }
  }

  public static String max(String[] a, NullSafeStringComparator sc) {
    String maxStr = a[0];
    for (int i = 1; i < a.length; i++) {
      if (compare(maxStr, a[i]) == -1) {
        maxStr = a[i];
      }
    }
    return maxStr;
  }

  public static String[][] step(String[][] arr) {
    if (arr.length < 3) {
      String[][] alertMsg = new String[1][];
      alertMsg[0][0] = "arr.length should be at least 3";
      return alertMsg;
    } else {
      String[][] stepped = new String[arr.length][arr[0].length];
      // 把arr的内容拷贝给stepped
      stepped = copyString(arr, stepped);

      // 双层for循环单个string，获取该string周围的最大值，并替换。
      for (int i = 1; i < stepped.length - 1; i++) {
        for (int j = 1; j < stepped[0].length - 1; j++) {
          stepped[i][j] = maxInNineEl(i, j, stepped);
        }
      }
      return stepped;
    }
  }

  public static String[][] copyString(String[][] source, String[][] target) {
    for (int i = 0; i < source.length; i++) {
      for (int j = 0; j < source[0].length; j++) {
        target[i][j] = source[i][j];
      }
    }
    return target;
  }

  public static String maxInNineEl(int i, int j, String[][] stepped) {
    String max = stepped[i][j];
    for (int k = j - 1; k < (j - 1) + 3; k++) {
      if (compare(max, stepped[i - 1][k]) == -1) {
        max = stepped[i - 1][k];
      }
    }
    for (int k = j - 1; k < (j - 1) + 3; k++) {
      if (compare(max, stepped[i][k]) == -1) {
        max = stepped[i][k];
      }
    }
    for (int k = j - 1; k < (j - 1) + 3; k++) {
      if (compare(max, stepped[i + 1][k]) == -1) {
        max = stepped[i + 1][k];
      }
    }
    return max;
  }

  @Override
  public boolean hasMoreElements() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Object nextElement() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Object next() throws NamingException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasMore() throws NamingException {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void close() throws NamingException {
    // TODO Auto-generated method stub

  }
}
