class Machine {
	private String name;
	private int code;

	// constructors do not have to have return type.even voids do.
	public Machine() {
		this("Frank", 420);
		// must be the first line

		// has to have same name as class
		// should initialize variables before letting them be set
		// can invoke constructors to set variables
		System.out.println("First constructor!");
	}

	public Machine(String name) {
		this(name, 0);
		
		System.out.println("Second constructor!");
		this.name = name;
	}

	public Machine(String name, int code) {

		System.out.println("Third constructor!");
		this.name = name;
		this.code = code;
	}
}

public class constructor_practice {
	public static void main(String[] args) {
		// every time you create a new insitance, constructor runs
		Machine machine1 = new Machine();
		// even though the constructors have the same name, it will look for one that accepts a string
	}
}

// when calling the first constructor, the first line calls on the third constructor
// only after the third constructor finishes does the last line of the first constructor output