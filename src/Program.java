
public enum Program {
	JAVA("Java Development"), JS("Java Script"), HTML("Hypertext Markup Language"), CSS("Cascading Style Sheets");
	
	private String name;
	
	Program(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
