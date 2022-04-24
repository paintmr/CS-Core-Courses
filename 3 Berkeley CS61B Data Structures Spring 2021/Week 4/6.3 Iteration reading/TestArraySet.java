import java.util.Iterator;

public class TestArraySet {
  public static void main(String[] args) {
    ArraySet<String> s = new ArraySet<>();
    s.add("libu");
    s.add("neige");
    s.add("zhanshifu");
    s.add("shanggongju");
    s.add("taichangsi");
    System.out.println(s.contains("taichangsi"));
    System.out.println(s.size());

    // 循环打印s里面的string，下面两种方法都可以。
    // 方法一，用s里面的迭代器
    Iterator<String> sIterator = s.iterator();
    while (sIterator.hasNext()) {
      System.out.println(sIterator.next());
    }

    // 方法二。因为ArraySet继承了Iterable，所以可以直接用这种循环打印的方法。
    // This is how set works. class Set extends class Collection. class Collection
    // extends class Iterable.
    for (String string : s) {
      System.out.println(string);
    }
  }
}
