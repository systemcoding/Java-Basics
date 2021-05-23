import java.util.Scanner;

public class IFElseConditions {
   public static void main(String[] args) {
        int a;
	int b;
	
	System.out.println("Enter a number:");
	Scanner scan1 = new Scanner(System.in);
	a = scan1.nextInt();
	
	System.out.println("Enter another number:");
	Scanner scan2 = new Scanner(System.in);
	b = scan2.nextInt();
	
        if(a != b) {
	  System.out.println("the no's aren't same"); 
        }else {
	  System.out.println("The conidtion is not met!"); 
        }
}
