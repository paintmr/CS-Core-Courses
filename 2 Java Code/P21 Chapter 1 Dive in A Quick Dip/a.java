class Exercise1b {
  public static void main(String[] args) {
    int x = 1;
    while (x < 10) {
      if (x > 3) {
        System.out.println("big x");
      }
      x += 1; // 添加的代码
    }
  }
}

// 结果
// big x打印了6次