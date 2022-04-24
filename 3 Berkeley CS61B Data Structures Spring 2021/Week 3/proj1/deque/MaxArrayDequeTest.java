package deque;

import org.junit.Test;

import java.util.Comparator;

import static org.junit.Assert.*;

public class MaxArrayDequeTest {
    private class IntComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    // The comparator orders the String elements of the array in the alphabetical order according to the beginning of the letter
    private class StrComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            // 如o1开头字母排在o2开头字母前面，返回负数
            return o1.compareTo(o2);
        }
    }

    // Compare strings according to their length. Shorter ones are on the front. If the lengths are the same, by alphabetical order.
    private class StrLenComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int lth1 = o1.length();
            int lth2 = o2.length();
            if (lth1 == lth2) {
                for (int i = 0; i < lth1; i++) {
                    if (o1.charAt(i) != o2.charAt(i)) {
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
            }
            return lth1 - lth2;
        }
    }

    @Test
    public void maxWithDefaultComparator() {
        IntComparator intComparator = new IntComparator();
        // Using the IntComparator as the default comparator of the MaxArrayDeque constructor
        MaxArrayDeque<Integer> maxArrInt = new MaxArrayDeque<>(intComparator);

        for (int i = 0; i < 10; i++) {
            maxArrInt.addFirst(i);
            maxArrInt.addLast(i+10);
        }

        assertEquals(19, (int) maxArrInt.max());


    }

    @Test
    public void maxWithoutDefaultComparator() {

        StrComparator strComparator = new StrComparator();
        // Using the StrComparator as the default comparator of the MaxArrayDeque constructor
        MaxArrayDeque<String> maxArrStr = new MaxArrayDeque<>(strComparator);
        maxArrStr.addFirst("it");
        maxArrStr.addLast("is");
        maxArrStr.addFirst("a");
        maxArrStr.addFirst("lovely");
        maxArrStr.addLast("sunny");
        maxArrStr.addFirst("day");

        String retStr = maxArrStr.max();
        // 按照首字母排序，排在最后的是sunny
        assertEquals("sunny", retStr);

        // 按照字母长度，排在最后的是lovely
        StrLenComparator strLenComparator = new StrLenComparator();
        String resStrLth = maxArrStr.max(strLenComparator);
        assertEquals("lovely",resStrLth);

        // 如果再加一个lovelz，排在最后的是lovelz
        maxArrStr.addFirst("lovelz");
        String resStrLth2 = maxArrStr.max(strLenComparator);
        assertEquals("lovelz",resStrLth2);

        // 如果再加一个macron，排在最后的是macron
        maxArrStr.addFirst("macron");
        String resStrLth3 = maxArrStr.max(strLenComparator);
        assertEquals("macron",resStrLth3);
    }

}
