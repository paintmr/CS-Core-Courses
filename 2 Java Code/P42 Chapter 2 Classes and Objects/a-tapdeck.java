class TapeDeckTestDrive {
  public static void main(String[] args) {
    TapeDeck t = new TapeDeck(); // 添加的代码
    t.canRecord = true;
    t.playTape();
    if (t.canRecord == true) {
      t.recordTape();
    }
  }
}

class TapeDeck {
  boolean canRecord = false;

  void playTape() {
    System.out.println("tape playing");
  }

  void recordTape() {
    System.out.println("tape recording");
  }
}

// 上述兩個類互換了位置，得把public static void main(String[] args)放在第一個類裡面。
// 運行的結果，打印了：
// tape playing
// tape recording
