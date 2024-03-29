package editstring;

public interface EditStringInterface {

	//U—make all letters upper case
	void toUppercase();
	
	//L—make all letters lower case
	void toLowercase();
	
	//R—reverse the string
	String reverse();
	
	//C ch1 ch2—change all occurrences of ch1 to ch2
	String change(String c1, String c2);
	
	//Z—undo the most recent change
	String undo();
}
