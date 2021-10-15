import java.util.*;
import static java.lang.System.out;

class FullMoons {
  static int DAY_IM = 1000 * 60 * 60 * 24;

  public static void main(String[] args) {
    Calendar c = Calendar.getInstance();
    c.set(2004, 0, 7, 15, 40);
    long day1 = c.getTimeInMillis();
    for (int x = 0; x < 60; x++) {
      // 每次循环，都加29.52天的时间，就到下一个满月
      day1 += (DAY_IM * 29.52);
      c.setTimeInMillis(day1);
      out.println(String.format("full moon on %tc", c));
    }
  }
}
// 不需要的代码
// import java.io.*;
// static import java.lang.System.out;
// Calendar c=new Calendar();
// println
// (c.format
// (“full moon on %t”, c));
// c.set(2004,1,7,15,40);
// static int DAY_IM = 60 * 60 * 24;
