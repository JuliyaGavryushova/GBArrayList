public class GBNode<E> {
    private E value;
    private GBNode<E> next;
    private GBNode<E> prev;

    public GBNode(E value, GBNode<E> next, GBNode<E> prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public GBNode<E> getNext() {
        return next;
    }

    public void setNext(GBNode<E> next) {
        this.next = next;
    }

    public GBNode<E> getPrev() {
        return prev;
    }

    public void setPrev(GBNode<E> prev) {
        this.prev = prev;
    }
}
