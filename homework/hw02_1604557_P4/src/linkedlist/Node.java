package linkedlist;

public class Node<T> {

    protected T data;
    protected Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Node<T> n) {
        this.next = n;
    }

    public Node getNext() {
        return this.next;
    }

    public T getData() {
        return this.data;
    }

    public String toString() {
        return this.data.toString();
    }
}
