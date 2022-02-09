public class SLList {
    /**Private variables and methods can only be accessed by code inside the same .java file, e.g. in this case SLList.java.*/
    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds x to the front of the list*/
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Returns the first item in the list*/
    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.addFirst(5);
        int x = L.getFirst();
        System.out.println(x);
    }
}

