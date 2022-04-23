package tester;

import static org.junit.Assert.*;
import org.junit.Test;
import student.StudentArrayDeque;
import edu.princeton.cs.introcs.StdRandom;

public class TestArrayDequeEC {
  @Test
  public void addIsEmptySizeTest() {


    StudentArrayDeque<String> lld1 = new StudentArrayDeque<String>();

    assertTrue("A newly initialized LLDeque should be empty", lld1.isEmpty());
    lld1.addFirst("front");

    assertEquals(1, lld1.size());
    assertFalse("lld1 should now contain 1 item", lld1.isEmpty());

    lld1.addLast("middle");
    assertEquals(2, lld1.size());

    lld1.addLast("back");
    assertEquals(3, lld1.size());

    System.out.println("Printing out deque: ");
    lld1.printDeque();

  }

  @Test
  /** Adds an item, then removes an item, and ensures that dll is empty afterwards. */
  public void addRemoveTest() {

    StudentArrayDeque<Integer> lld1 = new StudentArrayDeque<Integer>();
    // should be empty
    assertTrue("lld1 should be empty upon initialization", lld1.isEmpty());

    lld1.addFirst(10);
    // should not be empty
    assertFalse("lld1 should contain 1 item", lld1.isEmpty());

    lld1.removeFirst();
    // should be empty
    assertTrue("lld1 should be empty after removal", lld1.isEmpty());

  }

  @Test
  /* Tests removing from an empty deque */
  public void removeEmptyTest() {

    StudentArrayDeque<Integer> lld1 = new StudentArrayDeque<>();
    lld1.addFirst(3);

    lld1.removeLast();
    lld1.removeFirst();
    lld1.removeLast();
    lld1.removeFirst();

    int size = lld1.size();
    String errorMsg = "  Bad size returned when removing from empty deque.\n";
    errorMsg += "  student size() returned " + size + "\n";
    errorMsg += "  actual size() returned 0\n";

    assertEquals(errorMsg, 0, size);

  }

  @Test
  /* Check if you can create LinkedListDeques with different parameterized types*/
  public void multipleParamTest() {


    StudentArrayDeque<String>  lld1 = new StudentArrayDeque<String>();
    StudentArrayDeque<Double>  lld2 = new StudentArrayDeque<Double>();
    StudentArrayDeque<Boolean> lld3 = new StudentArrayDeque<Boolean>();

    lld1.addFirst("string");
    lld2.addFirst(3.14159);
    lld3.addFirst(true);

    String s = lld1.removeFirst();
    double d = lld2.removeFirst();
    boolean b = lld3.removeFirst();

    assertEquals("string", s);
    assertEquals(3.14159, d, 0.00001);
    assertTrue(b);

  }

  @Test
  public void bigLLDequeTest(){
    ArrayDequeSolution<Integer> ads = new ArrayDequeSolution<>();
    StudentArrayDeque<Integer> sad = new StudentArrayDeque<>();


    for (int i = 0; i < 8; i++) {
      sad.addLast(i);
    }

    for (double i = 0; i < 4; i++) {
      double removedFirst = (double) sad.removeFirst();
      assertEquals("Should have the same value", i, removedFirst, 0.0);
    }
    // 这里出问题。
    for (double i = 7; i > 4; i--) {
      double removedLast = (double) sad.removeLast();
      assertEquals("Should have the same value", i, removedLast, 0.0);
    }
  }

  @Test
  public void bigLLDequeTestString(){
    ArrayDequeSolution<String> ads = new ArrayDequeSolution<>();
    StudentArrayDeque<String> sad = new StudentArrayDeque<>();
    String[] str = {"it","is","a","lovely", "spring","sunny","day","let","us","enjoy","ourselves","ok"};
    for (int i = 0; i < str.length/2; i++) {
      ads.addFirst(str[i]);
      sad.addFirst(str[i]);
    }
    for (int i = str.length/2; i < str.length; i++) {
      ads.addLast(str[i]);
      sad.addLast(str[i]);
    }
    for (int i = 0; i < str.length/2; i++) {
      assertEquals("Should have the same value", ads.removeFirst(), sad.removeFirst());
    }
    for (int i = str.length; i >= str.length / 2; i--) {
      assertEquals("When i = " + i + ", there is an error" , ads.removeLast(), sad.removeLast());
    }
  }
}
