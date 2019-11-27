package app;

import collections.*;

public class ForEachDriver {
	public static void main (String[] args) {
		CollectionInterface <String> myCollection = new ArrayCollection <String>();
		myCollection.add("Mona Lisa");
		myCollection.add("Book of Secrets");
		myCollection.add("The Declaration of Independence");
		myCollection.add("The Book of Kells");
		myCollection.add("Moon rock");
		for(String treasure : myCollection )
			System.out.println(treasure);
	}
}
