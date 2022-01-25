package src;

import java.util.Scanner;

public class PracticeProblems {
	public static void main(String[] args) {

		// problem 1 start
		System.out.println("Enter the length:");
		Scanner scanL = new Scanner(System.in);
		int l = scanL.nextInt();

		System.out.println("Enter the width:");
		Scanner scanW = new Scanner(System.in);
		int w = scanW.nextInt();

		int p = 2 * (l + w);
		System.out.println("The perimeter is " + p);

		// problem 1 end

		// problem 2 start
		int year;
		System.out.println("Enter the year:");
		Scanner scanY = new Scanner(System.in);
		year = scanY.nextInt();

		if ((year % 4) == 0) {
			System.out.println("The year is leap");
		} else {
			System.out.println("The year is not leap!");
		}

		// problem 2 end

		// problem 3 start
		int age;
		System.out.println("Enter your age:");
		Scanner scanAge = new Scanner(System.in);
		age = scanAge.nextInt();

		if (age >= 18) {
			System.out.println("You are eligble to vote!");
		} else if (age <= 18) {
			System.out.println("You are not eligble to vote");
		}
		// problem 3 end
	}
}
