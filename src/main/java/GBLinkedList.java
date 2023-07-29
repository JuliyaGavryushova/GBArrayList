import java.util.Arrays;
import java.util.Iterator;

public class GBLinkedList<E> implements GBLinked<E>, Iterable<E>, DescendingIterator<E> {
    private GBNode<E> head;
    private GBNode<E> tail;
    private int size = 0;

    public GBLinkedList() {
        tail = new GBNode<E>(null, null, head);
        head = new GBNode<E>(null, tail, null);
    }

    @Override
    public void addLast(E e) {
        GBNode<E> prev = tail;
        prev.setValue(e);
        tail = new GBNode<E>(null, null, prev);
        prev.setNext(tail);
        size++;
    }

    @Override
    public void addFirst(E e) {
        GBNode<E> next = head;
        next.setValue(e);
        head = new GBNode<E>(null, next, null);
        next.setPrev(head);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElement(int index) {
        GBNode<E> temp = head.getNext();
        for (int i = 0; i < index; i++) {
            temp = getNextElement(temp);
        }
        return temp.getValue();
    }

    public GBNode<E> getNextElement(GBNode<E> current) {
        return current.getNext();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int count = 0;

            @Override
            public boolean hasNext() {
                return count < size;
            }

            @Override
            public E next() {
                return getElement(count++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int count = size - 1;
            @Override
            public boolean hasNext() {
                return count >= 0;
            }

            @Override
            public E next() {
                return getElement(count--);
            }
        };
    }
}
