package app;

import java.util.HashMap;

import stack.LinkedListStack;
import stack.StackInterface;
import stack.StackOverflowException;

//		Bonus for the adventurous ones: write a code to remove the duplicates from the linked list stack. When fed with “top: A” → “B” → “B”→
//		“A”, it should update the linked list stack to contain only “top: A” → “B”.
public class RemoveDriver {
	
	public static void main(String[] args) throws StackOverflowException {
		
		StackInterface<String> stack = new LinkedListStack<String>();
		StackInterface<String> holder = new LinkedListStack<String>(); // this is a placeholder stack
        HashMap<String, Boolean> map = new HashMap<String, Boolean>(); // map to keep track of duplicate letters
        stack.push("A");
        stack.push("B");
        stack.push("B");
        stack.push("A"); 
        
        System.out.println("Original Stack: " + stack.toString());

        // loop through stack creating duplicates map and pushing unique values to holder
        while (stack.top() != null) {
        	if (map.containsKey(stack.top())) {
        		stack.pop();
        	} else {
        		map.put(stack.top(), true);
        		holder.push(stack.top());
        		stack.pop();
        	}
        }
        // printing holder stack but its reversed 
        System.out.println("Holder Stack: " + holder.toString());
        
        // reverse holder stack back into original empty stack
        while(holder.top() != null) {
        	stack.push(holder.top());
        	holder.pop();
        }
        System.out.println("Original Stack (De-duped): " + stack.toString());
	}
}
