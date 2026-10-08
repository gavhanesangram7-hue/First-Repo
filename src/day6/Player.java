package day6;
import java.util.Scanner;

public class Player {
	
	private int jerseynumber;
	private String playername;
	private int matchesplayed;
	private int runsscored;
	
	
	public void acceptplayer() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the jerseynumber: ");
		
		jerseynumber = sc.nextInt();
		
		System.out.println("please enter the players name :");
		
		playername = sc.next();

		System.out.println("please enter the matchesplayed :");
		
		matchesplayed = sc.nextInt();

		System.out.println("please enter the runsscored :");
		
		runsscored = sc.nextInt();
		
	
		
		
		
	}
	public void displayplayer() {
		
		
		System.out.println("the jsrseynumber is : "+jerseynumber);
		System.out.println("the jsrseynumber is : "+playername);
		System.out.println("the jsrseynumber is : "+matchesplayed);
		System.out.println("please enter the runsscored by the player: "+runsscored);
		

	}
	
	public void avaragescoreoftheplayer() {
		
		double avarage = runsscored/matchesplayed;
		
		System.out.println("The avarage score of the player is : "+avarage);
		
		
	}
	
	
	

}
