public class TestSort {
    /**Tests the sort method of the Sort class*/
    public static void testSort() {
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void testFindSmallest() {
        String[] input = {"i", "have", "an", "egg"};
        int expectedIndex = 2;

        int smallestIndex = Sort.findSmallest(input,0);
        org.junit.Assert.assertEquals(expectedIndex, smallestIndex);
    }

    /** Test the Sort.swap method. */
    public static void testSwap() {
        String[] input = {"i", "have", "an", "egg"};
        int a = 0;
        int b = 2;
        String[] expected = {"an" , "have", "i", "egg"};

        Sort.swap(input, a, b);
        org.junit.Assert.assertArrayEquals(expected, input);
    }

    public static void main(String[] args) {
//        testFindSmallest();
//        testSwap();
        testSort();
    }
}
