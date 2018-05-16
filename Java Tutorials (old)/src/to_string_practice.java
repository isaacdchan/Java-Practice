// concatenating strings is inefficient. string + string = newstring uses 3 strings
// using a string builder maintains the same string and adds to it

class Frog {

	// public method
	public String toString() {
		// inefficient
		// return id + ": " + name

		// efficient
		// StringBuilder sb = new StringBuilder();
		// sb.append(id).append(": ").append(name);
		// return sb.toString();

		// more efficient
		return String.format("%-4d: %s", id, name);
	}

	private int id;
	private String name;

	// constructor allows you to set id and name
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}

}

public class to_string_practice {
	public static void main(String[] args) {
		Frog frog1 = new Frog(1, "Francis");
		Frog frog2 = new Frog(2, "Froopy");
		// pl on object will invoke the two string methods to find a string representation of the object
		// without two string object, will print a classname@hashcode
		System.out.println(frog1);
		System.out.println(frog2);


	}
}