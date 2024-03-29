package stack;

import java.util.ArrayList;

public class ArrayListStack<T> implements StackInterface<T> {
    protected ArrayList<T> elements;

    public ArrayListStack() {
        this.elements = new ArrayList<T>();
    }

    @Override
    public void push(T type) throws StackOverflowException {
        elements.add(type);
    }

    @Override
    public void pop() throws StackOverflowException {
        if (this.isEmpty()) {
            throw new StackOverflowException("Stack is empty");
        } else {
            elements.remove(elements.size() - 1);
        }
    }

    @Override
    public T top() throws StackOverflowException {
        if (this.isEmpty()) {
            throw new StackOverflowException("Stack is empty");
        } else {
            return elements.get(elements.size() - 1);
        }
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }
    
    public String toString() {
    	String result = "";
    	for (int i = 0; i < this.elements.size(); i++) {
    		result += this.elements.get(i);
    	}
    	return result;
    }
}
