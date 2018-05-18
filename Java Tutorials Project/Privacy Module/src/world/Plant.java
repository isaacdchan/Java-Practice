package world;

public class Plant {
	// public means accessible from anywhere. this is bad practice.
	// should make instance variables private to prevent outside tampering
	// should only make them accessible through methods so you can control exactly how users interacat with them
	public String name;

	// uppercase and final modifier instances mean it's constant
	public final static int ID = 1;
	// only accessible in this class
	private String type;
	//protected means only within package and class
	protected String size;
	//without access level modifier, it's also package level
	int height;

	// within the class, can prefix instances with "this" for clarification
	// this is a constructor so all plants will be named plantholomew
	public Plant() {
		this.name = "Plantholomew";
		this.type = "lettuce";
		//regardless of access level modifier, always available in class
		this.size = "large";
	}
}