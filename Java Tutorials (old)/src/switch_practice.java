import java.util.Scanner;

public class switch_practice{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter commaand: ");
		String line = input.nextLine();

		// similar to if statement. more effective in some cases (usually checking strings or int)
		// list out options and results. default is 'else'
		switch(line){
		case "start":
			System.out.println("Machine started!");
			break;
		case "stop":
			System.out.println("Machine stopped...");
			break;
		default:
			System.out.println("Please enter 'stop' or 'start'.");
		}
	}
}