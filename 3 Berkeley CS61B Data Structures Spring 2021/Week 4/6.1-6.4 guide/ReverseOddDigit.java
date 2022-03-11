import java.util.Iterator;

public class ReverseOddDigit implements Iterable<Integer> {
  private int value;

  public ReverseOddDigit(int v) {
    value = v;
  }

  public Iterator<Integer> iterator() {
    return new ReverseOddDigitIterator();
  }

  private class ReverseOddDigitIterator implements Iterator<Integer> {
    public boolean hasNext() {
      if (value == 0) {
        return false;
      } else {
        if (value % 2 == 0) {
          value = value / 10;
        }
        return true;
      }
      // 下面的代码是按照exercise的思路写的，也可以
      // if (value == 0) {
      // return false;
      // }
      // if (value % 2 != 0) {
      // return true;
      // } else {
      // value = value / 10;
      // return true;
      // }
    }

    public Integer next() {
      String valueStr = Integer.toString(value);
      String valueStrLst = valueStr.substring(valueStr.length() - 1);
      int valueLst = Integer.parseInt(valueStrLst);
      value = value / 10;
      return valueLst;
    }
  }

}
