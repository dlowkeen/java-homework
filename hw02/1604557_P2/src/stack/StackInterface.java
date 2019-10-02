package stack;

public interface StackInterface<T> {
    // Adds a new element to the top of the stack
    void push(T type) throws StackOverflowException;

    // Removes the top element of the stack and returns that element
    void pop() throws StackOverflowException;

    // Peeks at the top of the stack
    T top() throws StackOverflowException;

    boolean isEmpty();
    boolean isFull();
}
