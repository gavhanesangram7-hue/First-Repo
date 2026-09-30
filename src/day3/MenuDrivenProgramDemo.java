package day3;

import java.util.Scanner;

public class MenuDrivenProgramDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {

        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int n2 = sc.nextInt();

        

        
            System.out.println("****MENU****");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("0. Exit");

            double result = 0.0;

            System.out.println("Please enter your choice here:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    result = n1 + n2;
                    break;

                case 2:
                    result = n1 - n2;
                    break;

                case 3:
                    result = n1 * n2;
                    break;

                case 4:
                    result = (double) n1 / n2;
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

            System.out.println(result);

        } while (choice != 0);

    }
}