package day5;

public class StringFormatDemo {

    public static void main(String[] args) {

        String name = "Sangram";
        int age = 22;
        double marks = 85.50;

        String result = String.format(
                "My name is %s, I am %d years old and my marks are %.2f", name, age, marks);

        System.out.println(result);
    }
}