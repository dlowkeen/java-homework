package app;

import pair.BasicPair;
import pair.ArrayPair;
import pair.PairInterface;

public class Main {
	public static void main(String[] args) {
		
		// BASIC PAIR
		PairInterface<String> myBasicPair = new BasicPair<String>("Kobe", "Shaq");
		System.out.println(myBasicPair.getFirst() + " " + myBasicPair.getSecond());
		
		PairInterface<Integer> myOtherBasicPair = new BasicPair<Integer>(12, 21);
		System.out.println(myOtherBasicPair.getFirst() + " " + myOtherBasicPair.getSecond());
		
		// ARRAY PAIR
		String[] myStringArray = new String[]{"a", "b"};
		PairInterface<String> myArrayPair = new ArrayPair<String>(myStringArray);
		System.out.println(myArrayPair.getFirst() + " " + myArrayPair.getSecond());
		
		Integer[] myIntArray = new Integer[]{1, 2};
		PairInterface<Integer> myIntArrayPair = new ArrayPair<Integer>(myIntArray);
		System.out.println(myIntArrayPair.getFirst() + " " + myIntArrayPair.getSecond());
	}
}
