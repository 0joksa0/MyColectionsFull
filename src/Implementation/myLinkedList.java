package Implementation;


import Interface.myIterator;
import Interface.myList;

import java.util.function.Consumer;

public class myLinkedList<T> implements myList<T> {
    private myNode<T> head;
    int size =0;

    public myLinkedList() {
        this.head = null;
    }

    @Override
    public boolean add(T element) {
        myNode<T> newNode = new myNode<>();
        newNode.setData(element);
        newNode.setNext(null);
        if(head == null)
            head = newNode;
        else {
            myNode<T> curNode = head;
            while(curNode.getNext() != null){
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
        size++;
        return true;
    }

    @Override
    public void clear() {
        head = null;
    }

    @Override
    public boolean contains(T element) {
        if(head == null)
            return false;
        myNode<T> curNode = head;
        if(curNode.getData().equals(element))
            return true;
        while(curNode.getNext() != null){
            curNode = curNode.getNext();
            if(curNode.getData().equals(element))
                return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public myIterator<T> iterator() {
        return new myLinkedListIterator<>(head);
    }

    @Override
    public void forEach(Consumer<? super T> elem) {

    }

    @Override
    public boolean remove(Object element) {
        myNode<T> curNode = head;
        while(curNode.getNext() != null){
            if(curNode.getNext().getData().equals(element)){
                if (curNode.getNext().getNext() == null)
                    curNode.setNext(null);
                else
                    curNode.setNext(curNode.getNext().getNext());
                size--;
                return true;
            }

            curNode = curNode.getNext();
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object[] toarray() {
        Object[] array = new Object[size];
        myNode<T> cur = head;
        int i = 0;
        while (cur != null){
            array[i++] = cur.getData();
            cur = cur.getNext();
        }
        return array;
    }

    @Override
    public void add(int index, T element) {
       throw new UnsupportedOperationException("Methode not implementad");
    }

    @Override
    public T get(int index) {
        if(index >= size)
            return null;
        myNode<T> cur = head;
        T val = null;
        int i = 0;
        while(cur != null){
            if(index == i) {
                val = cur.getData();
            }
            i++;
            cur = cur.getNext();
        }
        return val;
    }

    @Override
    public int indexOf(Object element) {
        myNode<T> cur = head;
        int i =0;
        while(cur != null){
            if(cur.getData().equals(element))
                return i;
            i++;
            cur = cur.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object element) {
        myNode<T> cur = head;
        int i =0;
        int index = -1;
        while(cur != null){
            if(cur.getData().equals(element))
                index = i;
            i++;
            cur = cur.getNext();
        }
        return index;
    }

    @Override
    public T remove(int index) {
        if(index >= size)
            return null;
        myNode<T> curNode = head;
        T res = null;
        int i = 0;
        while(curNode.getNext() != null){
            if(i +1 == index){
                res = curNode.getNext().getData();
                if (curNode.getNext().getNext() == null)
                    curNode.setNext(null);
                else
                    curNode.setNext(curNode.getNext().getNext());
                size--;
                return res;
            }
            i++;
            curNode = curNode.getNext();
        }
        return res;
    }

    @Override
    public T set(int index, T element) {
        if(index >= size)
            return null;
        myNode<T> cur = head;
        T res = null;
        int i = 0;
        while(cur.getNext() != null){
            if(index == i) {
                res = cur.getData();
                cur.setData(element);
            }
            i++;
            cur = cur.getNext();
        }
        return res;
    }
}
