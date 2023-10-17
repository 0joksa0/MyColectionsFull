package Implementation;

import Interface.myIterator;
import Interface.myList;

import java.util.function.Consumer;

public class myArrayList<T> implements myList<T> {
    private T[] list;
    private int number = 0;

    public myArrayList() {
        list = (T[]) new Object[0];
    }

    @Override
    public boolean add(T element) {
        if(list.length > number) {
            list[number++] = element;
            return true;
        }
        T[] y = (T[]) new Object[list.length+10];
        for (int i = 0; i < list.length ; i++) {
            y[i] = list[i];
        }
        y[number++] = element;
        list = y;
        return true;
    }

    @Override
    public void clear() {
            list = (T[]) new Object[0];
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < number; i++) {
        if(list[i].equals(element))
            return true;
    }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return number == 0;
    }

    @Override
    public myIterator<T> iterator() {
        return new myArrayIterator<>(this.list, this.number);
    }

    @Override
    public void forEach(Consumer<? super T> elem) {
        throw  new UnsupportedOperationException("Operation is not implemented");
    }

    @Override
    public boolean remove(Object element) {
        int index = indexOf(element);
        T res = remove(index);
        return res != null;
    }

    @Override
    public int size() {
        return number;
    }

    @Override
    public Object[] toarray() {
        return new Object[0];
    }

    @Override
    public void add(int index, T element) {
            throw new UnsupportedOperationException("Metoda jos uvek nije implementirana");
    }

    @Override
    public T get(int index) {
        for (int i = 0; i < number; i++) {
            if(i == index)
                return list[i];
        }
        return null;
    }

    @Override
    public int indexOf(Object element) {
        for (int i = 0; i < number; i++) {
            if(list[i].equals(element))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object element) {
        int index = -1;
        for (int i = 0; i < number; i++) {
            if(list[i].equals(element))
                index = i;
        }
        return index;
    }

    @Override
    public T remove(int index) {
        if(index >= number)
            return null;
        T[] y = (T[]) new Object[list.length];
        int pom = 0;
        T res = list[index];
        for (int i = 0; i < number; i++) {
            if(i == index)
                continue;
            y[pom++] = list[i];
        }
        number--;
        list = y;
        return res;
     }

    @Override
    public T set(int index, T element) {
        if(index < number) {
            T res = list[index];
            list[index] = element;
            return res;
        }
        return null;
    }
}
