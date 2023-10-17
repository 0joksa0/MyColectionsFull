package Interface;

public interface myCollection<T> extends myIterable<T> {
    boolean add(T element);
    void clear();
    boolean contains(T element);
    boolean equals(Object element);
    boolean isEmpty();
    myIterator<T> iterator();
    boolean remove(Object element);
    int size();
    Object[] toarray();


}
