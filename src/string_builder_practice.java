public class string_builder_practice {
	public static void main(String[] args) {
		
		// inefficient
		String random = "";
		random += "John";
		random += " is not";
		random += " very nice.";

		System.out.println(random);

		// efficient
		StringBuilder sb = new StringBuilder ("");
		sb.append("JK John is nice.");
		sb.append(" Or is he.");
		System.out.println(sb.toString());

		StringBuilder s = new StringBuilder ("");
		s.append("My name is Roger.")
		.append(" I eat poop.");
		// don't need to add the string before if forego ;

		// println outputs new line after end of text. print starts immediately after end of previous line
		System.out.println("Here is some text. \tThat was a tab. \nThis is a newline.");

		// print format
		System.out.printf("Inserting an integer %d, another integer but left aligned with width specified %-10d more random shit, then newline \n", 5, 69);

		for(int i=0; i<=20; i++) {
			System.out.printf("value of i: %3d\n", i);
		}

		// %s is string. %f is floating point, can specify width and number of decimal points
		// width includes the number. so if len(numbers before point + point) = 6 and width is 8, there will be 2 spaces
		// right or left aline determines if space is before or after
		System.out.printf("String Example: %s. Float Example: %10.2f.", "poop", 12345.6789);
		
	}
}