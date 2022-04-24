import java.util.Iterator;

public class LinkedListDeque<T> implements Iterable<T> {
    private static class Node<N> {
        private N item;
        private Node prev;
        private Node next;

        /**
         * 如果一個類的constructor標記為private，則在這個類的外面，無法實例化該類。如果inner
         * class的constructor標記為private，在outer class裡面，可以自由實例化多個該inner class。筆記見java.docx
         */
        private Node(N i, Node p, Node n) {
            item = i;
            prev = p;
            next = n;
        }
    }

    private final Node<T> sentinel = new Node<>(null, null, null);
    private int size;

    // Creates an empty linked list deque.
    public LinkedListDeque() {
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item) {
        sentinel.next = new Node<>(item, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }

    // Adds an item of type T to the front of the deque. You can assume that item is
    // never null.
    public void addFirst(T item) {
        sentinel.next = new Node<>(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size++;
    };

    // Adds an item of type T to the back of the deque. You can assume that item is
    // never null.
    public void addLast(T item) {
        sentinel.prev.next = new Node<>(item, sentinel.prev, sentinel);
        sentinel.prev = sentinel.prev.next;
        size++;
    };

    // Returns true if deque is empty, false otherwise.
    public boolean isEmpty() {
        if (sentinel.next == null) {
            return true;
        } else {
            return false;
        }
    };

    // Returns the number of items in the deque.
    public int size() {
        return size;
    };

    // Prints the items in the deque from first to last, separated by a space. Once
    // all the items have been printed, print out a new line.
    public void printDeque() {
        String[] items = new String[size];
        Node node = sentinel.next;
        if (node == null) {
            return;
        }
        for (int i = 0; i < size; i++) {
            items[i] = node.item.toString();
            node = node.next;
        }
        String dequeStr = String.join(" ", items);
        System.out.println(dequeStr);
    };

    // Removes and returns the item at the front of the deque. If no such item
    // exists, returns null.
    public T removeFirst() {
        if (sentinel.next == sentinel) {
            return null;
        } else {
            T returnItem = (T) sentinel.next.item;
            sentinel.next = sentinel.next.next;
            sentinel.next.prev = sentinel;
            return returnItem;
        }
    };

    // Removes and returns the item at the back of the deque. If no such item
    // exists, returns null.
    public T removeLast() {
        if (sentinel.prev == sentinel) {
            return null;
        } else {
            T returnItem = (T) sentinel.prev.item;
            sentinel.prev = sentinel.prev.prev;
            sentinel.prev.next = sentinel;
            return returnItem;
        }
    };

    /**
     * Gets the item at the given index, where 0 is the front, 1 is the next item,
     * and so forth. If no such item exists, returns null. Must not alter the deque!
     * get() must use iteration, not recursion.
     */
    public T get(int index) {
        LinkedListDeque<T> dllst = this;
        if (index < 0 || index >= size) {
            return null;
        } else {
            int i = 0;
            for (T item : dllst) {
                if (i == index) {
                    return item;
                }
                i++;
            }
            return null;
        }
    };

    /**
     * The Deque objects we’ll make are iterable (i.e. Iterable<T>) so we must
     * provide this method to return an iterator. public Iterator<T> iterator();
     */
    public Iterator<T> iterator() {
        return new LinkedListDequeIterator();
    }

    private class LinkedListDequeIterator implements Iterator<T> {
        private Node node;

        public LinkedListDequeIterator() {
            node = sentinel;
        }

        @Override
        public boolean hasNext() {
            if (node.next == sentinel) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public T next() {
            T returnItem = (T) node.next.item;
            node = node.next;
            return returnItem;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (!(o instanceof LinkedListDeque)) {
            return false;
        }
        LinkedListDeque<?> lldo = (LinkedListDeque<?>) o;
        if (lldo.size() != size()) {
            return false;
        } else {
            for (int i = 0; i < size; i++) {
                if (lldo.get(i) != get(i)) {
                    return false;
                }
            }
            return true;
        }
    };

    /** Same as get, but uses recursion. */
    public T getRecursive(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        return (T) getRecursiveHelper(index, sentinel.next);
    }

    private T getRecursiveHelper(int index, Node<T> node) {
        if (index == 0) {
            return node.item;
        } else {
            return (T) getRecursiveHelper(index - 1, node.next);
        }
    }

    public static void main(String[] args) {
        LinkedListDeque<Integer> myDLst = new LinkedListDeque<>();
        myDLst.addFirst(10);
        myDLst.addFirst(20);
        myDLst.addLast(50);
        myDLst.addLast(60);
        System.out.println(myDLst.isEmpty());
        System.out.println("size: " + myDLst.size());
        myDLst.printDeque();
        // System.out.println("removed first: " + myDLst.removeFirst());
        // System.out.println("removed last: " + myDLst.removeLast());
        System.out.println("the 2nd item: " + myDLst.get(2));
        System.out.println("the 2nd item (getRecursive): " + myDLst.getRecursive(2));

        LinkedListDeque<String> myDLst2 = new LinkedListDeque<>("what");
        myDLst2.addFirst("a");
        myDLst2.addFirst("lovely");
        myDLst2.addLast("sunny");
        myDLst2.addLast("day");
        System.out.println(myDLst2.isEmpty());
        System.out.println("size: " + myDLst2.size());
        myDLst2.printDeque();
        // System.out.println("removed first: " + myDLst2.removeFirst());
        // System.out.println("removed last: " + myDLst2.removeLast());
        System.out.println("the 2nd item: " + myDLst2.get(2));
        System.out.println("the 2nd item (getRecursive): " + myDLst2.getRecursive(2));

        // LinkedListDeque<Integer> myDLst3 = new LinkedListDeque<>();
        // myDLst3.addFirst(10);
        // myDLst3.addFirst(20);
        // myDLst3.addLast(50);
        // myDLst3.addLast(60);

        // System.out.println("myDlst equals myDlst3? " + myDLst.equals(myDLst3));
        // System.out.println("myDlst2 equals myDlst3? " + myDLst2.equals(myDLst3));

    }
}
