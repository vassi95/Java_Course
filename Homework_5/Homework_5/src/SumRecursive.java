import java.util.Scanner;

public class SumRecursive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 10 and 30000: ");
		int number = input.nextInt();
		if (number < 10 || number > 300000) {
			System.out.printf("Wrong number!");
		} else {

			System.out.printf("\nThe sum is:");
			System.out.print(sum(number));
		}
		input.close();

	}

	public static long sum(int num) {
		long sum;
		if (num == 1)
			return 1;

		else
			sum = num + sum(num - 1);
		return sum;

	}

}
