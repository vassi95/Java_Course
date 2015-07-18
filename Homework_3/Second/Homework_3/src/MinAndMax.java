import java.util.Scanner;

public class MinAndMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		System.out.print("Enter how many numbers you want to input: ");
		int n = input.nextInt();

		for (int i = 1; i < n + 1; i++) {
			System.out.printf("Enter number %d: ", i);

			int num = input.nextInt();
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}

		System.out.println("\nThe MAX number is " + max);
		System.out.println("The MIN number is " + min);
		input.close();
	}

}
