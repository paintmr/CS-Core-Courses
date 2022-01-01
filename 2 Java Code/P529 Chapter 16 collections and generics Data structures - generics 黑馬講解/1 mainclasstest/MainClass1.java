import java.util.ArrayList;

public class MainClass1 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    list.add("java");
    list.add(100);
    list.add(true);

    for (int i = 0; i < list.size(); i++) {
      Object o = list.get(i);
      String str = (String) o;
      System.out.println(str);
    }
  }
}
