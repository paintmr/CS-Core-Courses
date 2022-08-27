import java.util.*;

class FilteredList<T> implements Iterable<T> {
  List<T> list;
  Predicate<T> pred;

  public FilteredList(List<T> L, Predicate<T> filter) {
    this.list = L;
    this.pred = filter;
  }

  public Iterator<T> iterator() {
    return new FilteredListIterator();
  }

  private class FilteredListIterator implements Iterator<T> {
    int index;

    public FilteredListIterator() {
      index = 0;
      moveIndex();
    }

    @Override
    public boolean hasNext() {
      return index < list.size();
    }

    @Override
    public T next() {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      T answer = list.get(index);
      index += 1;
      moveIndex();
      return answer;
    }

    private void moveIndex() {
      while (hasNext() && !pred.text(list.get(index))) {
        index += 1;
      }
    }
  }
}