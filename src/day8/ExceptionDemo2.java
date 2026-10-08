package day8;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionDemo2 {
	public static void main(String[] args) {
		 try {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the numerator");
		int numerator = sc.nextInt();

		System.out.println("Please enter the denominator");
		int denominator = sc.nextInt();
				
				
	    double result = numerator/denominator;
		
		System.out.println(result);
		
		   }
		 catch(ArithmeticException | InputMismatchException ex) {
			 System.out.println("Please enter the valid input");
			 
			 
			 
		 }
		 catch(Exception ex) {
			 System.out.println("Some Issue Occured");
		 }
		
		
		
				
		
		
		
	}
	

}
