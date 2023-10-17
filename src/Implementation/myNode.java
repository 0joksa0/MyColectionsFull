package Implementation;

public class myNode<T> {
    private T data;
    private myNode<T> next;

    public myNode(T data, myNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public myNode() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public myNode<T> getNext() {
        return next;
    }

    public void setNext(myNode next) {
        this.next = next;
    }

}
