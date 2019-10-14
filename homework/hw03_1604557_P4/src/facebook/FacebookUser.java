package facebook;

public class FacebookUser {
//	Implement an equals method that such that two
//	FacebookUsers are equal if they have the same username.
	private int numFriends;
	private String username;
	
	public FacebookUser(int numFriends, String username) {
		this.numFriends = numFriends;
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public int getNumFriends() {
		return this.numFriends;
	}
	
	public boolean equals(FacebookUser compare) {
		if (this.username == compare.getUsername()) {
			return true;
		} else {
			return false;
		}
	}
}
