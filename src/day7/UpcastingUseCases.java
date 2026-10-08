package day7;

public class UpcastingUseCases {

    public static void main(String[] args) {

        int n = 5;
        double m = 10.5;

        test(n);
        display(m);
    }

    public static void test(int x) {
        System.out.println(x);
    }

    public static void display(double x) {
        System.out.println(x);
    }
}