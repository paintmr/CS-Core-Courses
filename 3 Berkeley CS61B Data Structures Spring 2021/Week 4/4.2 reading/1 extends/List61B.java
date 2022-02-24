public interface List61B<Item> {
  public void insert(Item x, int position);

  public void addFirst(Item x);

  public void addLast(Item x);

  public Item getFirst();

  public Item getLast();

  public Item get(int i);

  public int size();

  public Item removeLast();

  default public void print() { // Remember to write default. Everything that implements the List61B class can
                                // use this print() method, as long as they do not override print().
    for (int i = 0; i < size(); i++) {
      System.out.print(get(i) + " "); // get has to seek all the way to the given item for SLists, so it is not
                                      // efficient for an SLList. Therefore, the SLList has to override it to make it
                                      // more efficient. But this is efficient for an AList, so an AList does
                                      // not have to override print().
    }
    System.out.println("");
  }

}