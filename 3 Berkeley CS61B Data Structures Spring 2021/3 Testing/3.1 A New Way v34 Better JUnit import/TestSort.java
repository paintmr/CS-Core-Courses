/**
 * 這一版本與上一版本相比，做了如下改動：
 * We first add the import statement import org.junit.Test; to the top of our file.
 * After doing this, we can replace all instances of @org.junit.Test with simply @Test.
 *
 * We then add our second import statement import static org.junit.Assert.*.
 * After doing this, anywhere we can omit anywhere we had org.junit.Assert..
 * For example, we can replace org.junit.Assert.assertEquals(expected2, actual2); with simply assertEquals(expected2, actual2);
 * */
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSort {
    /**Tests the sort method of the Sort class*/
    @Test
    public void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expectedIndex = 2;

        int smallestIndex = Sort.findSmallest(input,0);
        assertEquals(expectedIndex, smallestIndex);
    }

    /** Test the Sort.swap method. */
    @Test
    public void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an" , "have", "i", "egg"};

        Sort.swap(input, a, b);
        assertArrayEquals(expected, input);
    }
}
