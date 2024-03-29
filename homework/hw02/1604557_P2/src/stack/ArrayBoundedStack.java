package stack;

public class ArrayBoundedStack<T> implements StackInterface<T> {
    protected T[] elements;
    protected int size;
    protected int topIndex;

    public ArrayBoundedStack(int size) {
        elements = (T[]) new Object[size];
        this.size = size;
        this.topIndex = -1;
    }

    @Override
    public void push(T el) throws StackOverflowException {
        if (!this.isFull()) {
            elements[++topIndex] = el;
        } else {
            System.out.println("Stack is full");
            throw new StackOverflowException("The stack is full");
        }
    }

    @Override
    public void pop() throws StackOverflowException {
        if (!isEmpty()) {
            elements[this.topIndex] = null;
            this.topIndex--;
        } else {
            throw new StackOverflowException("The stack is empty");
        }
    }

    @Override
    public T top() throws StackOverflowException {
        if (!isEmpty()) {
            return elements[this.topIndex];
        } else {
            throw new StackOverflowException("The stack is empty");
        }
    }

    @Override
    public boolean isEmpty() {
        return this.topIndex == -1;
    }

    @Override
    public boolean isFull() {
        return (this.size - 1 == this.topIndex);
    }
    
//  (2.5 points) String toString()—creates and returns a string that correctly represents the current stack. Such a method could prove useful
//  for testing and debugging the class and for testing and debugging applications that use the class. Assume each stacked element already
//  provided its own reasonable toString method.
    public String toString() {
    	String result = "";
    	for (int i = 0; i < elements.length; i++) {
    		result += elements[i];
    	}
    	return result;
    }
    
//  (2.5 points) int size()—returns a count of how many items are currently on the stack. 
//  Do not add any instance variables to the ArrayBoundedStack class in order to implement this method.
    public int size() {
    	return this.elements.length;
    }
    

//  (5 points) void popSome(int count)—removes the top count elements
//  from the stack; throws StackUnderflowException if there are less than
//  count elements on the stack.
    public void popSome(int count) throws StackUnderflowException {
    	if (this.elements.length < count) {
    		throw new StackUnderflowException("Not enough elements in stack");
    	} else {
    		for (int i = 0; i < count; i++) {
    			elements[this.topIndex] = null;
    			this.topIndex--;    			
    		}
    	}
    }
    
    
//  (10 points) boolean swapStart()—if there are less than two elements
//  on the stack returns false; otherwise it reverses the order of the top
//  two elements on the stack and returns true
    public boolean swapstart() {
    	if (this.elements.length < 2) {
    		return false;
    	} else {
    		T top = this.elements[this.elements.length - 1];
    		T next = this.elements[this.elements.length - 2];
    		this.elements[this.elements.length - 1] = next;
    		this.elements[this.elements.length - 2] = top;
    		return true;
    	}
    }
    
    
}
