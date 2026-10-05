package day5;

public class StringImmutability {
	
	public static void main(String[] args) {
		
		String name = "Virat"; // it stores the virat name in the refrence name
		
		System.out.println(name); // print the refrence that is name
		
		 String name1 = name.concat("kohli"); // now it creates the another refrence name1 and concat the name refrence with "kohli"
		 
		 
		 System.out.println(name1); // prints the name1 refrence which holding the viratkohli.

		 
		
		
		
	}

}
