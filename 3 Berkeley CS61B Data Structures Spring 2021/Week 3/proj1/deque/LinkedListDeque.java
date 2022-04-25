package deque;
import java.util.Iterator;

public class LinkedListDeque<T> implements Deque<T>, Iterable<T> {
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

    /** Creates an empty linked list deque. */
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

    /** Adds an item of type T to the front of the deque. You can assume that item is never null.*/
    @Override
    public void addFirst(T item) {
        sentinel.next = new Node<>(item, sentinel, sentinel.next);
        sentinel.next.next.prev = sentinel.next;
        size++;
    };

    /** Adds an item of type T to the back of the deque. You can assume that item is never null.*/
    @Override
    public void addLast(T item) {
        sentinel.prev.next = new Node<>(item, sentinel.prev, sentinel);
        sentinel.prev = sentinel.prev.next;
        size++;
    };

    /** Returns true if deque is empty, false otherwise.*/
//    public boolean isEmpty() {
//        // if (sentinel.next == sentinel) {
//        //     return true;
//        // } else {
//        //     return false;
//        // }
//
//        return size() == 0;
//    };

    /** Returns the number of items in the deque.*/
    @Override
    public int size() {
        return size;
    };

    /** Prints the items in the deque from first to last, separated by a space. Once all the items have been printed, print out a new line.*/
    @Override
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

    /** Removes and returns the item at the front of the deque. If no such item exists, returns null.*/
    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } 
        T returnItem = (T) sentinel.next.item;
        sentinel.next = sentinel.next.next;
        sentinel.next.prev = sentinel;
        size--;
        return returnItem;
        
    };

    /** Removes and returns the item at the back of the deque. If no such item exists, returns null. */
    @Override
    public T removeLast() {
        if (isEmpty()) {
            return null;
        } 
        T returnItem = (T) sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        sentinel.prev.next = sentinel;
        size--;
        return returnItem;
        
    };

    /** Gets the item at the given index, where 0 is the front, 1 is the next item, and so forth. If no such item exists, returns null. Must not alter the deque! get() must use iteration, not recursion.*/
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else {
            int i = 0;
            for(T item : this) {
                if(i == index) {
                    return item;
                }
                i++;
            }
            return null;
        }
    };

    /** The Deque objects we’ll make are iterable (i.e. Iterable<T>) so we must provide this method to return an iterator. */
    public Iterator<T> iterator() {
        return new LinkedListDequeIterator();
    }

    private class LinkedListDequeIterator implements Iterator<T> {
        private Node<T> node;

        public LinkedListDequeIterator(){
            node = sentinel;
        }

        @Override
        public boolean hasNext(){
            if (node.next == sentinel) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public T next(){
            T returnItem =(T) node.next.item;
            node = node.next;
            return returnItem;
        }
    }

    /** Returns whether or not the parameter o is equal to the Deque. o is considered equal if it is a Deque and if it contains the same contents (as goverened by the generic T’s equals method) in the same order. (ADDED 2/12: You’ll need to use the instance of keywords for this.)*/
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
        LinkedListDeque<T> lldo = (LinkedListDeque<T>) o;
        if (lldo.size() != size()) {
            return false;
        }
        for(int i = 0; i < size; i++) {
            if(lldo.get(i) != get(i)) {
                return false;
            }
        }
        return true;
    };

    /** Same as get, but uses recursion.*/
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
}
