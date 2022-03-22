public class IntList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public int size() {
    if (rest == null) {
      return 1;
    }
    return 1 + rest.size();
  }

  public int iterativeSize() {
    IntList node = this;
    int size = 0;
    while (node != null) {
      size++;
      node = node.rest;
    }
    return size;
  }

  public int get(int index) {
    if (index < 0) {
      System.out.println("wrong index");
      return -111111;
    }
    if (index == 0) {
      return first;
    }
    if (rest != null) {
      return rest.get(index - 1);
    } else {
      System.out.println("index out of boundry");
      return -222222;
    }
  }

  public static void main(String[] args) {
    IntList myIntList = new IntList(15, null);
    myIntList = new IntList(10, myIntList);
    myIntList = new IntList(5, myIntList);

    System.out.println(myIntList.size());
    System.out.println(myIntList.iterativeSize());

    System.out.println(myIntList.get(-1));
    System.out.println(myIntList.get(0));
    System.out.println(myIntList.get(2));
    System.out.println(myIntList.get(5));
  }
}