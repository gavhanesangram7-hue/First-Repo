package day6;
import java.util.Scanner;

public class Student {

    private int rollnumber;
    private String studentname;
    private double percentage;
    
    public Student() {                                        // This is a Constructor ,
    	rollnumber=101;                                       // It is a special type of method whose name is same as the class name ,
    	studentname= "Rohit";                                                    // It does not have any return type. 
    	percentage = 50.0;
    }

    public void acceptStudent() {
    	Scanner sc = new Scanner(System.in); 
    	
    	System.out.println("Please enter the roll number");
    	rollnumber = sc.nextInt();
    	
    	System.out.println("Please enter Students Name");
    	studentname = sc.next();
    	
    	System.out.println("Please enter the percentage ");
    	percentage = sc.nextDouble();
    	
   
    }
    
    public void displayStudent(){
    	
    	System.out.println("Roll Number is : "+rollnumber);
    	System.out.println("Student Name is :" +studentname);
    	System.out.println("Percentage is : "+percentage);

    	
    }
}