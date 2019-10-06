package app;

import java.util.HashMap;

import stack.LinkedListStack;
import stack.StackInterface;
import stack.StackOverflowException;

public class DetectDriver {
//	Project 4: (20 points) Write code to detect if there are duplicates in a
//	linked list stack or not. Make a test class that will test if the detection
//	of the duplicates works. Test your code on the following stack of Strings:
//	“top: A” → “B” → “B”→ “A”, for which your method should return
//	true. Also write a test for which the method returns false. Make sure to
//	document your code!
	public static void main(String[] args) throws StackOverflowException {
		// Successful detection
		StackInterface<String> linkedListStack = new LinkedListStack<String>();
		HashMap<String, Boolean> letterMap = new HashMap<String, Boolean>();
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("B");
        linkedListStack.push("A"); 
        
        System.out.println(detect(linkedListStack, letterMap));
        
        
        // Unsuccessful detection
        StackInterface<String> llstack = new LinkedListStack<String>();
        HashMap<String, Boolean> lettersMap = new HashMap<String, Boolean>();
        String[] inputs = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"};
        for (int i = 0; i < inputs.length; i++) {
        	llstack.push(inputs[i]);
        }
        
        System.out.println(detect(llstack, lettersMap));
	}
	
	public static boolean detect(StackInterface<String> stack, HashMap<String, Boolean> map) throws StackOverflowException {
		while (stack.top() != null) {
        	if (map.containsKey(stack.top())) {
        		return true;
        	} else {
        		map.put(stack.top(), true);
        	}
        	stack.pop();
        }
        return false;
	}
}
