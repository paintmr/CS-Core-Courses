import java.util.*;

public class TestMap {
  public static void main(String[] args) {
    // HashMap needs TWO type parameters - one for the key and one for the value.
    HashMap<String, Integer> scores = new HashMap<String, Integer>();

    // Use put() instead of add(), and now of course it takes two arguments(key,
    // value).
    scores.put("Kathy", 42);
    scores.put("Bert", 52);
    scores.put("Mia", 62);

    System.out.println(scores);
    // The get() methods takes a key, and returns the value (in this case, an
    // Integer).
    System.out.println(scores.get("Bert"));
  }
}

// 运行结果
// When you print a Map, it gives you the key=value, in braces {} instead of the
// brackets [] you see when you print lists and sets.
// {Kathy=42, Mia=62, Bert=52}
// 52