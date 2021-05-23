import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
          int a;
	  int b;
	  System.out.println("Enter a number:");
	  Scanner scanNum1 = new Scanner(System.in);
	  a = scanNum1.nextInt();
	  System.out.println("Enter another number:");
	  Scanner scanNum2 = new Scanner(System.in);
	  b = scanNum2.nextInt();
	  
	  int sum = a + b;
	  int product = a * b;
	  int diff = a - b;
	  int quo = a / b;
	  
	  System.out.printf("The sum is %d\n",sum);
	  System.out.printf("The product is %d\n",product);
	  System.out.printf("The diff is %d\n",diff);
	  System.out.printf("The quo is %d\n",quo);
}
