public class FindLargerNum {

  public static void main(String[] args) {
    int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
    System.out.print(max(numbers));
  }

  /** Return the maximum value */
  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
}