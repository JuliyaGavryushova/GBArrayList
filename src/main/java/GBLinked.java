public interface GBLinked<E> {
    void addLast(E e);

    void addFirst(E e);

    int size();

    E getElement(int index);

}
