class ClockTestDrive {
  public static void main(String[] args) {
    Clock c = new Clock();
    c.setTime("1245");
    String tod = c.getTime();
    System.out.println("time: " + tod);
  }
}

class Clock {
  String time;

  void setTime(String t) {
    time = t;
  }

  // void getTime() { //刪掉的代碼。void的method不能return值
  String getTime() { // 添加的代碼，return的是個string
    return time;
  }
}

// 2個class換個順序
// 打印的內容是time: 1245