package day2;
import java.util.Scanner;
public class AdultAndMinor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your age over here");
		
		
		int age = sc.nextInt();
		
		while(age<0||age>120) {
			System.out.println("Invalid age ! Please enter correct age .");
			System.out.println("Please enter your age again");
			age = sc.nextInt();
			
		}
		
		System.out.println(age);
		if(age>=18) {
			System.out.println("You are Eligible for the drive.");
		}
		else {
			System.out.println("you are under age . not eligible for the drive.");
		}
		
		
		
	}
}
