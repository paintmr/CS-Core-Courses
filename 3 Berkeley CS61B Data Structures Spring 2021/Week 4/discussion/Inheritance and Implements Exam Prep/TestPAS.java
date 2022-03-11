public class TestPAS {
  public static void main(String[] args) {
    Person jack = new Athlete();
    SoccerPlayer chirasree = new SoccerPlayer();
    jack.speakTo(chirasree); // kudos
    ((Athlete) jack).speakTo(chirasree); // take notes
  }
}
