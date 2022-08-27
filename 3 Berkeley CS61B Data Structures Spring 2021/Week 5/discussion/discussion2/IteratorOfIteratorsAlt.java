import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IteratorOfIteratorsAlt implements Iterator<Integer> {
  LinkedList<Integer> l;

  public IteratorOfIterators(List<Iterator<Integer>> a) {
    l = new LinkedList<>();
    while(!a.isEmpty()) {
      Iterator<Integer> current = a.remove(0)
      if (current.hasNext()) {
        l.add(current.next());
        a.add(current);
      }
    }
  }

  @Override
  public boolean hasNext() {
    return !l.isEmpty();
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    return l.removeFirst();
  }
}
