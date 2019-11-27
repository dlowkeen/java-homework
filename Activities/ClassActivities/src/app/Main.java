package app;

import java.util.ArrayList;
import java.util.Iterator;

import ch02.figures.Circle;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world");
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("alpha");
		strings.add("beta");
		strings.add("gamma");
		strings.add("delta");
		Iterator<String> iter = strings.iterator();
//		String hold;
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
//		strings.forEach(x -> {
//			String hold = iter.next();
//			if (hold.equals("gamma" )) {
//				iter.remove();
//			} else {
//				System.out.println(hold);
//			}
//		});
//		String hold;
//		for(String s: strings) {
//			hold = iter.next();
//			if (hold.equals("gamma" )) {
//				strings.remove(hold);
//			} else {
//				System.out.println(hold);
//			}
//		}
		
//		while (iter.hasNext()) {

		/*for (int i = 0; i < strings.size(); i++) {
			hold = iter.next();
			if (hold.equals("gamma" )) {
				iter.remove();
			} else {
				System.out.println(hold);
			}
		}*/
		
		
	}
}

//import java.io.*; 
//import java.util.*; 
//  
//class Test { 
//    public static void main(String[] args) 
//    { 
//        ArrayList<String> list = new ArrayList<String>(); 
//  
//        list.add("A"); 
//        list.add("B"); 
//        list.add("C"); 
//        list.add("D"); 
//        list.add("E"); 
//  
//        // Iterator to traverse the list 
//        Iterator iterator = list.iterator(); 
//  
//        System.out.println("List elements : "); 
//  
//        while (iterator.hasNext()) 
//            System.out.print(iterator.next() + " "); 
//  
//        System.out.println(); 
//    } 
//} 