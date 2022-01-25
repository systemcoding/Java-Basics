import java.util.Scanner;

public class Input {
   public static void main(String[] args) {
      int age;
      double gpa;

      System.out.println("Enter your age:");
      Scanner scanAge = new Scanner(System.in);
      age = scanAge.nextInt();

      System.out.println("The age is " + age);

      System.out.println("Enter your gpa:");
      Scanner scanGpa = new Scanner(System.in);
      gpa = scanGpa.nextDouble();

      System.out.println("The gpa is " + gpa);
   }
}
