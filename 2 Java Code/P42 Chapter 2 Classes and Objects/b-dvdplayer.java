class DVDPlayerTestDrive {
  public static void main(String[] args) {
    DVDPlayer d = new DVDPlayer();
    d.canRecord = true;
    d.playDVD();

    if (d.canRecord == true) {
      d.recordDVD();
    }
  }
}

class DVDPlayer {
  boolean canRecord = false;

  // 添加了method playDVD()
  void playDVD() {
    System.out.println("DVD playing");
  }

  void recordDVD() {
    System.out.println("DVD recording");
  }
}

// 上述兩個類互換了位置，得把public static void main(String[] args)放在第一個類裡面。
// 運行的結果，打印了：
// DVD playing
// DVD recording
