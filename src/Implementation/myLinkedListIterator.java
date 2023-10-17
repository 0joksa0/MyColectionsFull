package Implementation;

import Interface.myIterator;

public class myLinkedListIterator<T> implements myIterator<T> {
    myNode<T> head;
    public myLinkedListIterator(myNode<T> head) {
        this.head = head;
    }

    @Override
    public T next() {
        T value = head.getData();
        head = head.getNext();
        return value;
    }

    @Override
    public boolean hasNext() {
        return head.getNext() != null ? true : false ;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
