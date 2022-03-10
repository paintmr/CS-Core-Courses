import java.util.*;

public class IterableUtils {
  public static <T> List<T> toList(Iterable<T> iterable) {
    List<T> lst = new ArrayList<T>();
    for (T item : iterable) {
      if (item == null) {
        throw new IllegalArgumentException("You cannot add null to a List.");
      }
      lst.add(item);
    }
    return lst;
  }
}
