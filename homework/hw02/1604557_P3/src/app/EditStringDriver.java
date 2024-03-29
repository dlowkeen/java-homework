package app;

import java.util.Scanner;

import editstring.EditString;
import editstring.EditStringInterface;
import stack.ArrayListStack;
import stack.StackOverflowException;

public class EditStringDriver {
	public static void main(String[] args) throws StackOverflowException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide a string to work with:");
		String words = scanner.nextLine();
		EditStringInterface sentence = new EditString(words);
		String input = "";
		ArrayListStack<String> stack = new ArrayListStack<String>();
		ArrayListStack<String> forwardStack = new ArrayListStack<String>();
		
		String action = "";
		while (!action.equals("X")) {
			System.out.println("Please input action");
			input = scanner.nextLine();
			action = String.valueOf(input);
			stack.push(action);
		}
		
		// reverse stack to get correct order
		while (!stack.isEmpty()) {
			forwardStack.push(stack.top());
			stack.pop();
		}

		// loop through stack and perform action
		String prevSentence = "";
		while (!forwardStack.isEmpty()) {
			String command = forwardStack.top();
			switch (String.valueOf(command.charAt(0))) { 
	        case "U":
	        	prevSentence = sentence.toString();
	            sentence.toUppercase();
	            break; 
	        case "L":
	        	prevSentence = sentence.toString();
	            sentence.toLowercase();
	            break; 
	        case "R":
	        	prevSentence = sentence.toString();
	            sentence.reverse();
	            break; 
	        case "C": 
	        	prevSentence = sentence.toString();
	        	command = command.replaceAll("\\s+",""); // remove whitespace for some user input validation
	        	String c1 = String.valueOf(command.charAt(1));
	        	String c2 = String.valueOf(command.charAt(2));
	            sentence.change(c1, c2);
	            break; 
	        case "Z": 
	        	sentence = new EditString(prevSentence); // current bug: can only undo previous step. Possible Solution (create a stack of sentence history)
	        case "X": 
	            break;
	        }
			forwardStack.pop();
		}
		// print out final sentence
		System.out.println(sentence);
		scanner.close();
	}
	
}
