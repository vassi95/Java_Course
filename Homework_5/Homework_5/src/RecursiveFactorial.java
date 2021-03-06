import java.util.Scanner;

public class RecursiveFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = input.nextInt();

		System.out.printf("\nThe factorial of %d is: ", num);
		System.out.print(factorial(num));

		input.close();

	}

	public static long factorial(int number) {
		if (number == 0 || number == 1) {
			return 1;
		}
		return (number * factorial(number - 1));
	}

}

/*Another implementation of factorial function may be : */

//public static int factorial(int n) {
//    return (n <= 1) ? 1 : n*factorial(n-1);
//}