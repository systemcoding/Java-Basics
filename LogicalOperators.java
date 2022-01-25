import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age:");
		Scanner scanAge = new Scanner(System.in);
		age = scanAge.nextInt();

		if (age <= 50 || !(age >= 100)) {
			System.out.println("You are alive");
		} else if (age >= 50 && !(age <= 100)) {
			System.out.println("do something");
		}
	}
}
