public class ReplaceNumbers {
  public static void main(String[] args) {
    int[] arr = { 1, 2, -3, 4, 5, 4 };
    int n = 3;
    int[] arr2 = rplNu(arr, n);
    prtArr(arr2); // {4,8,-3,13,9,4}

    int[] arr3 = { 1, -1, -1, 10, 5, -1 };
    int n2 = 2;
    int[] arr4 = rplNu(arr3, n2);
    prtArr(arr4); // {-1,-1,-1,14,4,-1}
  }

  public static int[] rplNu(int[] arr, int n) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= 0) {
        int sum = 0;
        for (int j = 0; j <= n && i + j < arr.length; j++) {
          sum = sum + arr[i + j];
        }
        arr[i] = sum;
      } else {
        continue;
      }
    }
    return arr;
  }

  public static void prtArr(int[] arr) {
    System.out.print("{");
    for (int i = 0; i < arr.length; i++) {
      if (i == (arr.length - 1)) {
        System.out.println(arr[i] + "}");
      } else {
        System.out.print(arr[i] + ",");
      }
    }
  }
}