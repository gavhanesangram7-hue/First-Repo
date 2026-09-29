package day2;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       while(true) {
        System.out.println("please select the language ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Call routed to London");
                break;

            case 2:
                System.out.println("Call routed to Delhi");
                break;

            case 3:
                System.out.println("Call routed to Mumbai");
                break;

            default:
                System.out.println("Invalid choice");
        }
       }
   
    }
}