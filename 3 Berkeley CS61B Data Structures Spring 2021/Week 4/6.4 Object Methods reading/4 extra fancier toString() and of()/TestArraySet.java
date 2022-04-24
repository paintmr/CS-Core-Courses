public class TestArraySet {
  public static void main(String[] args) {
    ArraySet<Integer> arrS = new ArraySet<>();
    arrS.add(5);
    arrS.add(25);
    arrS.add(35);
    System.out.println(arrS.toString());

    ArraySet<String> aSetOfStrings = ArraySet.of("hi", "I'm", "here");
    System.out.println(aSetOfStrings);
  }
}