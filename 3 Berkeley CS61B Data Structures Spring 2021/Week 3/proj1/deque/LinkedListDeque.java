package deque;

public class LinkedListDeque<T> implements Deque<T> {
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

    // Gets the item at the given index, where 0 is the front, 1 is the next item,
    // and so forth. If no such item exists, returns null. Must not alter the deque!
    public T get(int index) {
        return T;
    };

    // The Deque objects we’ll make are iterable (i.e. Iterable<T>) so we must
    // provide this method to return an iterator.
    // public Iterator<T> iterator();

    // Returns whether or not the parameter o is equal to the Deque. o is considered
    // equal if it is a Deque and if it contains the same contents (as goverened by
    // the generic T’s equals method) in the same order. (ADDED 2/12: You’ll need to
    // use the instance of keywords for this.)
    public boolean equals(Object o) {
        return false;
    };

    // Same as get, but uses recursion.
    public T getRecursive(int index) {
        return T;
    }
}
