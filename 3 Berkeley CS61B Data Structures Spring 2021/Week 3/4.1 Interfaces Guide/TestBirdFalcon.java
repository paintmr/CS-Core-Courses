public class TestBirdFalcon {
  public static void main(String[] args) {
    Bird bird = new Falcon();
    Falcon falcon = (Falcon) bird;
    // bird.gulate(bird);
    falcon.gulate(falcon);
  }
}

public class Bird {
  // public void gulate(Bird b) {
  // System.out.println("Bird.Bird");
  // }

  // public void gulate(Falcon f) {
  // System.out.println("Bird.Falcon");
  // }
}

public class Falcon extends Bird {
  // public void gulate(Bird b) {
  // System.out.println("Falcon.Bird");
  // }

  public void gulate(Falcon f) {
    System.out.println("Falcon.Falcon");
  }
}