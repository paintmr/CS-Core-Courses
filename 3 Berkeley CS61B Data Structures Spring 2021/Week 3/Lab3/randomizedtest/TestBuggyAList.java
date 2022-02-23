package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
  // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        AListNoResizing<Integer> lstNoR = new AListNoResizing<>();
        BuggyAList<Integer> lstBuggy = new BuggyAList<>();

        lstNoR.addLast(4);
        lstBuggy.addLast(4);
        lstNoR.addLast(5);
        lstBuggy.addLast(5);
        lstNoR.addLast(6);
        lstBuggy.addLast(6);

        assertEquals(lstNoR.size(), lstBuggy.size());

        assertEquals(lstNoR.removeLast(), lstBuggy.removeLast());
        assertEquals(lstNoR.removeLast(), lstBuggy.removeLast());
        assertEquals(lstNoR.removeLast(), lstBuggy.removeLast());
    }

    @Test
    public void randomizedTest(){
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> buggyL = new BuggyAList<>();

        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            // StdRandom.uniform(int x, int y)returns a random integer in the range [0,2), i.e. exclusive of the right argument.
            int operationNumber = StdRandom.uniform(0, 4); // If the chosen number is 0, then a random number will be added to the end of the list. If the chose number is 1, then the size will be printed.
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                buggyL.addLast(randVal);
//                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int sizeL = L.size();
                int sizeBuggyL = buggyL.size();
//                System.out.println("sizeL: " + sizeL +"; sizeBuggyL: " + sizeBuggyL);
                assertEquals(sizeL,sizeBuggyL);
            } else if (L.size()!=0 && operationNumber == 2) {
                // getLast
                int lastLItem = L.getLast();
                int lastBuggyLItem = buggyL.getLast();
//                System.out.println("last item: " + lastLItem + "; last item in BuggyList: " + lastBuggyLItem);
                assertEquals(lastLItem,lastBuggyLItem);
            } else if (L.size()!=0 && operationNumber == 3) {
                // removeLast
                int removedLastItem = L.removeLast();
                int removedLastBuggyLItem = buggyL.removeLast();
//                System.out.println("removed item: " + removedLastItem + "; removed item in BuggyList: " + removedLastBuggyLItem);
                assertEquals(removedLastItem,removedLastBuggyLItem);
            }
        }
    }

}
