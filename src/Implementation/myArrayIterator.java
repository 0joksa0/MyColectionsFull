package Implementation;

import Interface.myIterator;

public class myArrayIterator<T> implements myIterator<T> {
    Object[] array;
    int current = 0;
    int size;
    public myArrayIterator(Object[] array, int size) {
        this.array = array;
        this.size = size;
    }

    @Override
    public T next() {
        if(current >= size)
            return null;
        return (T) array[current++];
    }

    @Override
    public boolean hasNext() {
        if (current >= size)
            return false;
        return true;
    }

    @Override
    public void remove() {
        throw  new UnsupportedOperationException("It is not implemented yet");
    }
}
