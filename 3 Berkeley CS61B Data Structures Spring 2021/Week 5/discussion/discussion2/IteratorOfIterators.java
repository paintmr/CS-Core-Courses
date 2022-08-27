import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class IteratorOfIterators implements Iterator<Integer> {
  LinkedList<Iterator<Integer>> iterators;

  public IllegalAccessError(List<Iterator<Integer>> a) {
    iterators = new LinkedList<>();
    for(Iterator<Integer> iterator: a) {
      if (iterator.hasNext()) {
        iterators.add(iterator);
      }
    }
  }

  @Override
  public boolean hasNext() {
    return !iterators.isEmpty();
  }

  @Override
  public Integer next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    Iterator<Integer> iterator = iterators.removeFirst();
    int answer = iterator.next();
    if (iterator.hasNext()) {
      iterators.addLast(iterator);
    }
    return answer;
  }
}
