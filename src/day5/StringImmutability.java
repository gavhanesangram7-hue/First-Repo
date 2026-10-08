package day5;

public class StringImmutability {
	
	public static void main(String[] args) {
		
<<<<<<< HEAD
		String name = "Virat"; // it stores the virat in the refrence->name
=======
		String name = "Virat"; // it stores the "virat" in the refrence ->name
>>>>>>> 5b8a16d (Java-OOP-Basics)
		
		System.out.println(name); // print the refrence.
		
		 String name1 = name.concat("kohli"); // now it creates the another refrence->name1 and concat the name refrence with "kohli"
		 
		 
		 System.out.println(name1); // prints the name1 refrence which holding the viratkohli.

		 
		
		
		
	}

}
