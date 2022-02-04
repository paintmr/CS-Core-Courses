public class TestSort {
    /** Test the sort method of the Sort class */
    public static void testSort() {
        String[] input = { "i", "have", "an", "egg" };
        String[] expected = { "an", "egg", "have", "i" };
        Sort.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (!input[i].equals(expected[i])) {
                System.out.println(
                        "Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i] + ".");
            }
        }
    }

    public static void main(String[] args) {
        testSort();
    }
}
