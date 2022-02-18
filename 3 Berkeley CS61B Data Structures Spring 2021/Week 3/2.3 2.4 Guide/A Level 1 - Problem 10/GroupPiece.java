/**
 * b The next part of this problem is take the Pieces in the given 1D Piece
 * array, where Pieces are in no
 * particular order, and put it into a 2D array where each row filled with
 * Pieces that have the same
 * latitude.
 *
 * c Our goal is to now to complete the process of taking in a 1D unsorted Piece
 * array and transform it
 * such that it becomes a sorted 2D array as shown on the first page of this
 * problem (longitudes increase
 * from left to right and latitudes increase from down to up).
 */
public class GroupPiece {

  public static void main(String[] args) {
    Piece[] p = new Piece[9];
    p[8] = new Piece(0, 0);
    p[7] = new Piece(0, 10);
    p[2] = new Piece(0, 20);
    p[1] = new Piece(10, 0);
    p[4] = new Piece(10, 10);
    p[3] = new Piece(10, 20);
    p[6] = new Piece(20, 0);
    p[5] = new Piece(20, 10);
    p[0] = new Piece(20, 20);

    GroupPiece gp = new GroupPiece();
    Piece[][] groupByLatResult = gp.groupByLat(p);
    gp.sortByLat(groupByLatResult);
    System.out.println(groupByLatResult);
  }

  public Piece[][] groupByLat(Piece[] p) {
    // 宽度是p数组长度的开方。因为开方公式Math.squrt()传入的和得到的都是double，所以要转换一下，才能得到int。
    int width = (int) Math.sqrt(p.length);
    Piece[][] latGroup = new Piece[width][width];
    int latitude = 0;
    // i 循环latitude
    for (int i = 0; i < width; i++) {
      // j 循环latitude内部的longitude
      for (int j = 0; j < width; j++) {
        // k循环乱序的p 1维数组
        for (int k = 0; k < p.length; k++) {
          if (p[k] != null && p[k].latitude == latitude) {
            latGroup[i][j] = p[k];
            p[k] = null;
            break;
          }
        }
      }
      latitude += 10;
    }
    return latGroup;
  }

  public Piece[][] sortByLat(Piece[][] p) {
    int width = p.length;
    Piece[][] latSort = new Piece[width][width];
    Piece temp = null;
    // int min = p[0][0].longitude;
    // int minIndex = -1;
    for (int i = 0; i < width; i++) {
      int startj = 0;
      int min = p[i][0].longitude;
      int minIndex = -1;
      for (int k = 0; k < width - 1; k++) {
        minIndex = findMin(min, minIndex, i, startj, width, p);
        swapMin(temp, minIndex, i, startj, p);
        startj++;
      }
    }
    return latSort;
  }

  // 找最小值
  public int findMin(int min, int minIndex, int i, int startj, int width, Piece[][] p) {
    for (int j = startj; j < width; j++) {
      if (min > p[i][j].longitude) {
        min = p[i][j].longitude;
        minIndex = j;
      }
    }
    return minIndex;
  }

  // 把最小值和遍历开始的值互换
  public void swapMin(Piece temp, int minIndex, int i, int startj, Piece[][] p) {
    temp = p[i][minIndex];
    p[i][minIndex] = p[i][startj];
    p[i][startj] = temp;
  }
}