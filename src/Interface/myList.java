package Interface;

public interface myList<T> extends myCollection<T> {
    void add(int index, T element);
    T get(int index);
    int indexOf(Object element);
    int lastIndexOf(Object element);
    T remove(int index);
    T set(int index, T element);


}
