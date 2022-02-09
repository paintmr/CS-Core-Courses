public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /** Having a sentinel simplifies out addLast method. No need for a special case to check if sentinel is null (since it is never null). */
    private IntNode sentinel;
    private int size;

    public SLList() {
        /**Sentinel node's item needs to be some integer, but doesn't matter what value we pick. */
        sentinel = new IntNode(63,null);
        size = 0;
    }

    public SLList(int x) {
        /**Sentinel node's item needs to be some integer, but doesn't matter what value we pick. */
        sentinel = new IntNode(63,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /** Adds x to the front of the list*/
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size ++;
    }

    /** Returns the first item in the list*/
    public int getFirst() {
        return sentinel.next.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList();
        L.addLast(25);
        int y = L.size();
        System.out.println(y);
    }

    /** Adds an item to the end of the list.*/
    public void addLast(int x) {
        size ++;

        IntNode p = sentinel;

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

