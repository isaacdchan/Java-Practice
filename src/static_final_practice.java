class Thing {
	public String name;
	public static String description;
	public final static int special_number = 420;
	public int id;
	// final means it cant be reassigned
	public static int count = 0;

	public static void show_info() {
		System.out.println(description);
	}

	public void show_info2() {
		System.out.println(name);
		System.out.println(description);
	}

	public Thing() {
		// the count variable is staic, so its shared by all objects
		// doesn't mean it can't be added to or changed
		id = count;
		count++;
	}

	public void get_count() {
		System.out.println(count);
	}
}

public class static_final_practice {
	public static void main(String[] args) {
		Thing.description = "I am a slug thing";
		// static methods work on static data because it is inherent
		// static methods don't work on instance data because it hasn't been created yet

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		// these are instances because each object has their own unique copy
		thing1.name = "John";
		thing2.name = "John2";

		// these are static because they can't change. same for each object
		System.out.println(thing1.description);

		thing1.show_info2();
		// instance methods word on static data and instance data because both have been
		// created by time of calling
		System.out.println(Thing.special_number);

	}
}