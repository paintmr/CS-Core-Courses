public class FillGridExercise {
  public static void main(String[] args) {
    int[] LL = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0 };
    int[] UR = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int[][] S = {
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 },
        { 0, 0, 0, 0, 0 }
    };

    FillGridExercise.fillGrid(LL, UR, S);
    System.out.println("done");
  }

  public static void fillGrid(int[] LL, int[] UR, int[][] S) {
    int N = S.length;
    int kL, kR;
    kL = kR = 0;

    // 循环S每个row
    for (int i = 0; i < N; i += 1) {
      // 循环S每个row内的column(填入LL的部分)
      for (int llinS = 0; llinS < i; llinS++) {
        // 循环LL的每个数字，取出来放到S中
        S[i][llinS] = LL[kL];
        kL++;
      }
      // 循环S每个row内的column(填入UR的部分)
      for (int urinS = i + 1; urinS < N; urinS++) {
        S[i][urinS] = UR[kR];
        kR++;
      }
    }

  }
}