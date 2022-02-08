public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /**Private variables and methods can only be accessed by code inside the same .java file, e.g. in this case SLList.java.*/
    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list*/
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size ++;
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

        L.addLast(25);
        int y = L.size();
        System.out.println(y);
    }

    /** Adds an item to the end of the list.*/
    public void addLast(int x) {
        size ++;

        IntNode p = first;

        /* Advance p to the end of the list.*/
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /* Returns the size of the list starting at IntNode p. */
    public int size() {
        return size;
    }
}

