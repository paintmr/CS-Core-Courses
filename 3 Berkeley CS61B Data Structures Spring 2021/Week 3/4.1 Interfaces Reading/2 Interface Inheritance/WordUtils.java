public class WordUtils {
  public static void main(String[] args) {
    // SLList和AList都可以。
    // SLList<String> someList = new SLList<>();
    AList<String> someList = new AList<>();
    someList.addLast("tian");
    someList.addLast("lan");
    someList.addLast("qi");
    someList.addLast("qingla");
    System.out.println(WordUtils.getLongestString(someList));

  }

  public static String getLongestString(List61B<String> l) {
    String longest = l.getFirst();
    for (int i = 1; i < l.size(); i++) {
      if (longest.length() < l.get(i).length()) {
        longest = l.get(i);
      }
    }
    return longest;
  }
}
