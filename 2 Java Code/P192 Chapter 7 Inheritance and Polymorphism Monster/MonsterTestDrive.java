public class MonsterTestDrive {
  public static void main(String[] args) {
    Monster[] ma = new Monster[3];
    ma[0] = new Vampire();
    ma[1] = new Dragon();
    ma[2] = new Monster();
    for (int x = 0; x < 3; x++) {
      ma[x].frighten(x);
    }
  }
}

class Monster {
  // 第1組
  // boolean frighten(int d) {
  // System.out.println("arrrgh");
  // return true;
  // }
  // 第2組
  // boolean frighten(int x) {
  // System.out.println("arrrgh");
  // return true;
  // }
  // 第3組
  // boolean frighten(int x) {
  // System.out.println("arrrgh");
  // return false;
  // }
  // 第4組
  boolean frighten(int z) {
    System.out.println("arrrgh");
    return true;
  }
}

class Vampire extends Monster {
  // 第1組
  // boolean frighten(int x) {
  // System.out.println("a bite?");
  // return false;
  // }
  // 第2組
  // int frighten(int f) {
  // System.out.println("a bite?");
  // return 1;
  // }
  // 第3組
  // boolean scare(int x) {
  // System.out.println("a bite?");
  // return true;
  // }
  // 第4組
  boolean frighten(byte b) {
    System.out.println("a bite?");
    return true;
  }
}

class Dragon extends Monster {
  boolean frighten(int degree) {
    System.out.println("breath fire");
    return true;
  }
}

// 第1組打印：
// a bite?
// breath fire
// arrrgh
// 第2組Vampire的return type int錯了，應該是boolean
// 第3組和第4組打印。第3組的Vampire是函數名稱不同（scare 和
// frighten）。第4組的Vampire是參數的類型不對，傳入的是int，而Vampire中frighten的參數類型是byte。所以這兩組都不會調用Vampire中自己的函數，而是去Monster中調用frighten函數
// arrrgh
// breath fire
// arrrgh