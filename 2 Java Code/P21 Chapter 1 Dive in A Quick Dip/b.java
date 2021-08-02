class b {// 添加的代码
  public static void main(String[] args) {
    int x = 5;
    while (x > 1) {
      x = x - 1;
      if (x < 3) {
        System.out.println("small x");
      }
    }
  }
}// 添加的代码

// 结果
// small x打印了2次