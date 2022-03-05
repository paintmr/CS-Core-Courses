public class TestArraySet {
  public static void main(String[] args) {
    ArraySet<String> s = new ArraySet<>();
    s.add(null);
    s.add("libu");
    s.add("neige");
    s.add("zhanshifu");
    s.add("shanggongju");
    s.add("taichangsi");
    System.out.println(s.contains("taichangsi"));
    System.out.println(s.size());

  }
}
