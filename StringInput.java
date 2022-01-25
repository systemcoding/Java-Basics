import java.util.Scanner;

public class StringInput {
	public static void main(String[] args) {
		String name;
		System.out.println("Enter your name:");
		Scanner scanName = new Scanner(System.in);
		name = scanName.nextLine();
		/*
		 * or
		 * name = scanName.next();
		 */

		System.out.println("The name is " + name);

		char alpha;
		System.out.println("Enter your alpha:");
		Scanner scanChar = new Scanner(System.in);
		alpha = scanChar.nextLine().charAt(0);

		System.out.println("The char is " + alpha);
	}
}
