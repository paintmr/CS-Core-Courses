/**
 * 這一版與上一版本相比，在TestSort.java中做了如下改動
 * 
 * (1) Precede each method with @org.junit.Test (no semi-colon).
 * (2) Change each test method to be non-static.(Yes this is weird, as it
 * implies you’d be instantiating TestSort.java. In fact, JUnit runners do this.
 * I don’t
 * know why.)
 * (3) Remove our main method from the TestSort class.
 */
public class TestSort {
    /** Tests the sort method of the Sort class */
    @org.junit.Test
    public void testSort() {
        String[] input = { "i", "have", "an", "egg" };
        String[] expected = { "an", "egg", "have", "i" };
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    @org.junit.Test
    public void testFindSmallest() {
        String[] input = { "i", "have", "an", "egg" };
        int expectedIndex = 2;

        int smallestIndex = Sort.findSmallest(input, 0);
        org.junit.Assert.assertEquals(expectedIndex, smallestIndex);
    }

    /** Test the Sort.swap method. */
    @org.junit.Test
    public void testSwap() {
        String[] input = { "i", "have", "an", "egg" };
        int a = 0;
        int b = 2;
        String[] expected = { "an", "have", "i", "egg" };

        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }
}
