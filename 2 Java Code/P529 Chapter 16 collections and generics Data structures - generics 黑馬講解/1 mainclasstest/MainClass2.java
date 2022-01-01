import java.util.ArrayList;

public class MainClass2 {
  public static void main(String[] args) {
    ArrayList<String> strList = new ArrayList<>();
    strList.add("java");
    strList.add("php");
    strList.add("python");

    for (int i = 0; i < strList.size(); i++) {
      String str = strList.get(i);
      System.out.println(str);
    }
  }
}
