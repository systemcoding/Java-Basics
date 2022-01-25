package src;

import java.util.Scanner;

public class SwitchCases {
	public static void main(String[] args) {

		int num;
		System.out.println("Enter a number:");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();

		switch (num) {
			case 90:
				System.out.println("The number is 90");
				break;
			case 45:
				System.out.println("The number is 45");
				break;
			case 30:
				System.out.println("The number is 30");
				break;
			default:
				System.out.println("The number is null");
		}
	}
}
