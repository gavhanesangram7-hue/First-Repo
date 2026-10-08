package day8;

public class ExcaeptionDemo {
	public static void main(String[] args) {
		
		int numerator = 10;
		int denominator = 0;
		try
		{
		double result  = numerator/denominator;    // ArithmeticException
		System.out.println(result);
		}
		catch(ArithmeticException ex) {
			System.out.println("please enter non zero denominator ");
		}
		
	}

}
