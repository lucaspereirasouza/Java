package objetos;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double result = Maxe(number1, number2, number3);

		System.out.println("Maximum is:" + result);

	}

	private static double Maxe(double number1, double val2, double number3) {
		Double first = Math.max(val2, number1);
		Double calc = Math.max(first, number3);
		return calc;
	}

}
