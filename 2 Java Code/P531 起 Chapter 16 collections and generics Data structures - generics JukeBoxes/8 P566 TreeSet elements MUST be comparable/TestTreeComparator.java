import java.util.*;

public class TestTreeComparator {
  public static void main(String[] args) {
    new TestTreeComparator().go();
  }

  public void go() {
    Book b1 = new Book("How Cats Work");
    Book b2 = new Book("Remix your Body");
    Book b3 = new Book("Finding Emo");
    BookCompare bCompare = new BookCompare();
    TreeSet<Book> tree = new TreeSet<Book>(bCompare);
    tree.add(b1);
    tree.add(b2);
    tree.add(b3);
    System.out.println(tree);
  }
}

class Book {
  String title;

  public Book(String t) {
    title = t;
  }
}

public class BookCompare implements Comparator<Book> {
  public int compare(Book one, Book two) {
    return (one.title.compareTo(two.title));
  }
}