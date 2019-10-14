package app;

import collections.*;

public class ArrayCollectionDriver {
	public static void main(String[] args) {
		System.out.println("toString Implementation");
		ArrayCollection<String> arrCollection = new ArrayCollection<String>();
		arrCollection.add("A");
		arrCollection.add("B");
		arrCollection.add("C");
		arrCollection.add("D");
		arrCollection.add("E");
		arrCollection.add("F");
		arrCollection.add("F");
		arrCollection.add("F");
		arrCollection.add("F");
		arrCollection.add("A");
		System.out.println(arrCollection.toString());
		
		
		System.out.println("\nCount Implementation");
		System.out.println("Number of A's: " + arrCollection.count("A"));
		System.out.println("Number of B's: " + arrCollection.count("B"));
		
		System.out.println("\nremoveAll Implementation");
		System.out.println("Before Removing A: " + arrCollection.toString());
		arrCollection.removeAll("A");
		System.out.println("After Removing A: " + arrCollection.toString());
		
		System.out.println("\ncombine Implementation");
		ArrayCollection<String> arrCollection2 = new ArrayCollection<String>();
		arrCollection2.add("X");
		arrCollection2.add("Y");
		arrCollection2.add("Z");
		
		ArrayCollection<String> arrCollection3 = arrCollection.combine(arrCollection2);
		System.out.println("Collection #3: " + arrCollection3.toString());
		System.out.println("Collection #1: " + arrCollection.toString());
		System.out.println("Collection #2: " + arrCollection2.toString()); // NOTE: original collections not mutated
	}
}
