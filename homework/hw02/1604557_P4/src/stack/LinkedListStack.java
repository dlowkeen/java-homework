package stack;

import linkedlist.Node;

public class LinkedListStack<T> implements StackInterface<T> {
    protected Node<T> top;

    public LinkedListStack() {
        this.top = new Node(null);
    }

    public LinkedListStack(Node<T> node) {
        this.top = node;
    }

    @Override
    public void push(T info) throws StackOverflowException {
        Node<T> newNode = new Node<T>(info);
        newNode.setNext(top);
        top = newNode;
    }

    @Override
    public void pop() throws StackOverflowException {
        if (isEmpty()) {
            throw new StackOverflowException("Stack is empty");
        } else {
            top = top.getNext();
        }
    }

    @Override
    public T top() throws StackOverflowException {
        if (isEmpty()) {
            throw new StackOverflowException("Stack is empty");
        } else {
            return this.top.getData();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean isFull() {
        return false;
    }
    
    public String toString() {
    	String result = "";

        Node<T> current = this.top;
        while(current != null && current.getData() != null){
            result += current.getData();
            current = current.getNext();

        }

        return result;
    }
}
