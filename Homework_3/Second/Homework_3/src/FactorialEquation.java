import java.util.Scanner;

public class FactorialEquation {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n_fact = 1;
		int k_fact = 1;
		int n_k_fact = 1;
		int n, k, n_k;

		for (;;) {

			System.out.print("\nEnter \"K\" ( Must be greater than 0): ");
			k = input.nextInt();
			if (k < 1) {
				System.out.print("ERROR!!!");
				continue;
			}
			System.out.print("Enter \"N\"( Must be greater than K: ");
			n = input.nextInt();
			if (n < k) {
				System.out.print("ERROR!!!");
				continue;
			}
			break;
		}
		n_k = n - k;

		for (int i = 1; i <= n; i++) {
			n_fact *= i;
		}

		for (int i = 1; i <= k; i++) {
			k_fact *= i;
		}

		for (int i = 1; i <= n_k; i++) {
			n_k_fact *= i;
		}

		int equation = (n_fact * k_fact) / n_k_fact;
		System.out.println("N!*K!/(N-K)! = " + equation);
		input.close();

	}

}
