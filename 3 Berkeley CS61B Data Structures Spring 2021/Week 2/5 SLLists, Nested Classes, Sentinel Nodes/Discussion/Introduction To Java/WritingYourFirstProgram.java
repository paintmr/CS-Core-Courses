// Implement fib which takes in an integer n and returns the nth Fibonacci number.
// You may not need to use all the lines.
// The Fibonacci sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, . . .. The first two numbers in the
// sequence are 0 and 1, and every number thereafter it is the sum of the two numbers
// in the sequence before it.

public class WritingYourFirstProgram {
  public static void main(String[] args) {
    System.out.println(WritingYourFirstProgram.fib(0));
    System.out.println(WritingYourFirstProgram.fib(1));
    System.out.println(WritingYourFirstProgram.fib(2));
    System.out.println(WritingYourFirstProgram.fib(3));
    System.out.println(WritingYourFirstProgram.fib(4));
    System.out.println(WritingYourFirstProgram.fib(5));
    System.out.println(WritingYourFirstProgram.fib(6));
    System.out.println(WritingYourFirstProgram.fib(7));
    System.out.println(WritingYourFirstProgram.fib(8));
    System.out.println(WritingYourFirstProgram.fib(9));

    /**
     * 从第0个开始算，已知第3个数是2，第4个数是3，求地6个数是多少
     * n=6，k=3，f0=2，f1=3
     */
    System.out.println("----------");
    System.out.println(WritingYourFirstProgram.fib2(6, 3, 2, 3));

  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    } else {
      return fib(n - 1) + fib(n - 2);
    }
  }

  /**
   * n 是求斐波那契数列中第n个数的值是多少（n从0开始算）。
   * k 是从斐波那契数列中第k个开始（k<=n)
   * f0 是第k个数的值
   * f1 是第k+1个数的值
   * 也就是，斐波那契数列中，已知某个值（f0）和这个值后面一个（f1），并知道f0是第几个（k），求第n个位置的数值（fib2的返回值）
   */
  public static int fib2(int n, int k, int f0, int f1) {
    if (n == k) {
      return f0;
    } else {
      return fib2(n, k + 1, f1, f0 + f1);
    }
  }
}
