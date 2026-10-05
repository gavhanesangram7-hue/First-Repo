package day4;

public class PrimeNumberUsingFunction {

    public static void main(String[] args) {

        int arr[] = {23, 18, 25, 40, 29};

        System.out.println("Prime numbers from array are as follows");

        for (int i = 0; i < arr.length; i++) {
            checkPrime(arr[i]);
        }
    }

    private static void checkPrime(int num) {

        int flag = 0;

        for (int j = 2; j <= Math.sqrt(num); j++) {

            if (num % j == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println(num);
        }
    }
}