import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();

		System.out.print("Enter secound number: ");
		int second = input.nextInt();

		System.out.print("Enter third number: ");
		int third = input.nextInt();
		System.out.print("\nThe greatest number is: ");
		System.out.print(greaterNum(greaterNum(first, second), greaterNum(second, third)));

		input.close();

	}

	public static int greaterNum(int firstNumber, int secondNumber) {
		if (firstNumber > secondNumber) {
			return firstNumber;
		}
		return secondNumber;
	}
}
