package day1assignments;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // user need to enter a number
	        System.out.print("Enter a number: ");
	        double number = scanner.nextDouble();
	        
	        // Check if the number is positive, negative, or zero
	        if (number > 0) {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else {
	            System.out.println("The number is zero.");
	        }

	}

}
