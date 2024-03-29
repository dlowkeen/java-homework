package editstring;

public class EditString implements EditStringInterface {

	protected String content;
	
	public EditString(String content) {
		this.content = content;
	}
	
	@Override
	public void toUppercase() {
		this.content = this.content.toUpperCase();
	}

	@Override
	public void toLowercase() {
		this.content = this.content.toLowerCase();
	}

	@Override
	public String reverse() {
		String result = "";
		for (int i = 0; i < content.length(); i++) {
			result = content.charAt(i) + result;
		}
		this.content = result;
		return this.content;
	}

	@Override
	public String change(String c1, String c2) {
		this.content = this.content.replace(c1, c2);
		return this.content;
	}

	@Override
	public String undo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String toString() {
		return this.content;
	}

}
