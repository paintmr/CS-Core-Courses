class DrumKitTestDrive {
  public static void main(String[] args) {
    DrumKit d = new DrumKit();
    d.snare = false;
    d.playSnare();
    d.playTopHat();
    if (d.snare == true) {
      d.playSnare();
    }
  }
}

class DrumKit {
  boolean topHat = true;
  boolean snare = true;

  void playSnare() {
    System.out.println("bang bang ba-bang");
  }

  void playTopHat() {
    System.out.println("ding ding da-ding");
  }
}

// 結果
// bang bang ba-bang
// ding ding da-ding