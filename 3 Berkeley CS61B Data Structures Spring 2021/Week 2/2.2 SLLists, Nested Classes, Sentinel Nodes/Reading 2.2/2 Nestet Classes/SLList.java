public class SLList {
    /**
     * If the nested class has no need to use any of the instance methods or
     * variables of SLList, you may declare the nested class static
     */
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /**
     * Private variables and methods can only be accessed by code inside the same
     * .java file, e.g. in this case SLList.java.
     */
    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds x to the front of the list */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /** Returns the first item in the list */
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
