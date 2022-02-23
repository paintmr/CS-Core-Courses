package timingtest;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by hug.
 */
public class TimeSLList {
    private static void printTimingTable(AList<Integer> Ns, AList<Double> times, AList<Integer> opCounts) {
        System.out.printf("%12s %12s %12s %12s\n", "N", "time (s)", "# ops", "microsec/op");
        System.out.printf("------------------------------------------------------------\n");
        for (int i = 0; i < Ns.size(); i += 1) {
            int N = Ns.get(i);
            double time = times.get(i);
            int opCount = opCounts.get(i);
            double timePerOp = time / opCount * 1e6;
            System.out.printf("%12d %12.2f %12d %12.2f\n", N, time, opCount, timePerOp);
        }
    }

    public static void main(String[] args) {
        timeGetLast();
    }

    public static void timeGetLast() {
        // TODO: YOUR CODE HERE

        AList<Integer> Ns = new AList<>();
        AList<Double> times = new AList<>();
        AList<Integer> opCounts= new AList<>();

        int N = 1000;
        int op = 10000;
        int testRound = 8;

        for (int i = 0; i < testRound; i++) {
            Ns.addLast(N);

            // 1. 每一轮开始，Create an SLList
            SLList<String> testList = new SLList<>();
            for (int j = 0; j < N; j++) {
                // 2. Add N items to the SLList
                testList.addLast("a");
            }
            // 3. Start the timer.
            Stopwatch sw = new Stopwatch();
            // 4. Perform M getLast operations on the SLList testList
            for (int j = 0; j < op; j++) {
                testList.getLast();
            }
            double timeInSeconds = sw.elapsedTime();
            times.addLast(timeInSeconds);

            opCounts.addLast(op);
            N *= 2;
        }
        printTimingTable(Ns, times, opCounts);
    }

}
