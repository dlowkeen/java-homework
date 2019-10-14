package app;

import facebook.*;

public class FacebookUserDriver {

	public static void main (String[] args) {
		FacebookUser user1 = new FacebookUser(2, "Mark Zuckerberg");
		FacebookUser user2 = new FacebookUser(3, "Donovan Lowkeen");
		System.out.println("Is " + user1.getUsername() + " equal to " + user2.getUsername());
		System.out.println("Answer: " + user1.equals(user2));
		
		FacebookUser user3 = new FacebookUser(4, "Donovan Lowkeen");
		System.out.println("Is " + user3.getUsername() + " equal to " + user2.getUsername());
		System.out.println("Answer: " + user2.equals(user3));
	}
}
