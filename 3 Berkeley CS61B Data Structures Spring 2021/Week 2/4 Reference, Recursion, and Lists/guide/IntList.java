public class IntList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public static void main(String[] args) {
    IntList L = new IntList(25, null);
    L = new IntList(15, L);
    L = new IntList(10, L);
    L = new IntList(5, L);

    System.out.println(L.size());
    System.out.println(L.iterativeSize());
    System.out.println(L.get(1));
    System.out.println(L.get(5));

    IntList Q = incrList(L, 3);
    System.out.println(Q);

    /** ---------- */
    IntList L2 = new IntList(33, null);
    L2 = new IntList(23, L2);
    L2 = new IntList(13, L2);
    L2 = new IntList(3, L2);

    IntList Q2 = dincrList(L2, 2);
    System.out.println(Q2);

  }

  /** Return the size of the list using... recursion! */
  public int size() {
    if (rest == null) {
      return 1;
    }
    /** return 1 + this.rest.size();也行 */
    return 1 + rest.size();
  }

  /** Return the size of the list using no recursion! */
  public int iterativeSize() {
    IntList p = this;
    int count = 0;
    while (p != null) {
      count += 1;
      p = p.rest;
    }
    return count;
  }

  /** Returns the ith value in this list. */
  public int get(int i) {
    if (i == 0) {
      return first;
    } else {
      if (rest != null) {
        return rest.get(i - 1);
      } else {
        System.out.print("The list is not that long. ");
        return -1;
      }
    }
  }

  /**
   * Returns an IntList identical to L, but with
   * each element incremented by x. L is not allowed
   * to change.
   */
  public static IntList incrList(IntList L, int x) {
    IntList Q = new IntList(L.first + x, null);
    incrListRecursion(L, Q, x);
    return Q;
  }

  public static IntList incrListRecursion(IntList L, IntList Q, int x) {
    if (L.rest != null) {
      Q.rest = new IntList(L.rest.first + x, null);
      incrListRecursion(L.rest, Q.rest, x);
    }
    return Q;
  }

  /**
   * Returns an IntList identical to L, but with
   * each element incremented by x. Not allowed to use
   * the 'new' keyword.
   */
  public static IntList dincrList(IntList L, int x) {
    L.first += x;
    if (L.rest != null) {
      dincrList(L.rest, x);
    }
    return L;
  }

}