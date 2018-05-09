import java.util.Scanner;

public class user_input_practice {
	public static void main(String[] args) {

		// create scanner object		
		Scanner input = new Scanner(System.in);

		// prompt user to enter string
		System.out.println("Enter a string: ");
		
		// actual object that takes in input
		String line = input.nextLine();

		// repeat back what you entered
		System.out.println("You entered: " + line);
	}
}