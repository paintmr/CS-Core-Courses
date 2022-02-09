public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public static void main(String[] args) {
        IntList oList = new IntList(9, null);
        oList = new IntList(7, oList);
        oList = new IntList(8, oList);
        oList = new IntList(8, oList);
        oList = new IntList(3, oList);
        oList = new IntList(4, oList);
        oList = new IntList(2, oList);
        oList = new IntList(1, oList);
        oList = new IntList(1, oList);

        oList.addAdjacent();
    }

    public void addAdjacent() {
       if (first == rest.first) {
            first = first * 2;
            rest = rest.rest;
            addAdjacent();
        } else {
            rest.addAdjacent();
       }
    }
}
