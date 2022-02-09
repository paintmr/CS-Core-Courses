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

    public static void main(String[] args) {
        SLList L1 = new SLList();
        L1.addFirst(2);
        L1.addLast(5);
        SLList L2 = new SLList();
        L2.addFirst(2);
        L2.addLast(5);
        L1.deleteFirst();
    }

    /** Adds x to the front of the list*/
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size ++;
    }

    /** Deletes the first node from the front of the list*/
    public void deleteFirst() {
        if (sentinel.next != null) {
            if (sentinel.next.next == null) {
                sentinel.next = null;
            } else {
                sentinel.next = sentinel.next.next;
            }
            size --;
        }
    }

    /** Returns the first item in the list*/
    public int getFirst() {
        return sentinel.next.item;
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

