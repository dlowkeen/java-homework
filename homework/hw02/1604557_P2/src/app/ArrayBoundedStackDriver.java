package app;

import stack.ArrayBoundedStack;
import stack.StackOverflowException;
import stack.StackUnderflowException;

public class ArrayBoundedStackDriver {
	
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		ArrayBoundedStack<Integer> arrStack = new ArrayBoundedStack<Integer>(5);
		arrStack.push(1);
		arrStack.push(2);
		arrStack.push(3);
		arrStack.push(4);
		arrStack.push(5);
		System.out.println(arrStack.toString());
		arrStack.popSome(2);
		System.out.println(arrStack.toString());
		arrStack.push(6);
		System.out.println(arrStack.toString());
		arrStack.push(7);
		System.out.println(arrStack.toString());
		arrStack.swapstart();
		System.out.println(arrStack.toString());
	}

}
