package DebugExercise;

/**
 * Exercise for learning how the debug, breakpoint, and step-into
 * feature work.
 */
public class DebugExercise1 {
    public static int divideThenRound(int top, int bottom) {
        //int quotient = top / bottom; // 这个源代码存在问题：① quotient不能是int，应该是float或者double，用来接收小数。商很多时候是小数。② top和bottom应该转为float，否则算出来是整数0
        float quotient = (float) top / (float) bottom; // float和下面的int一起用；double和long一起用。
        /** round 表示"四舍五入"，算法为Math.floor(x+0.5) ，即将原来的数字加上 0.5 后再向下取整，所以 Math.round(11.5) 的结果为 12，Math.round(-11.5) 的结果为 -11。*/
        int result = Math.round(quotient);
        return result;
    }

    public static void main(String[] args) {
        int t = 10;
        int b = 2;
        int result = divideThenRound(t, b);
        System.out.println("round(" + t + "/" + b + ")=" + result);

        int t2 = 9;
        int b2 = 4;
        int result2 = divideThenRound(t2, b2);
        System.out.println("round(" + t2 + "/" + b2 + ")=" + result2);

        int t3 = 3;
        int b3 = 4;
        int result3 = divideThenRound(t3, b3);
        System.out.println("round(" + t3 + "/" + b3 + ")=" + result3);
    }
}
