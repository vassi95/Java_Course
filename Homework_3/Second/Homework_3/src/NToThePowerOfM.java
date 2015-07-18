import java.util.Scanner;

public class NToThePowerOfM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter \"N\": ");
		int n = input.nextInt();
		System.out.print("Enter \"M\": ");
		int m = input.nextInt();
		long finalResult = 1;
		for (int i = 0; i < m; i++) {
			finalResult *= n;
		}
		System.out.print("N to to the power of M is: " + finalResult);
		input.close();

	}

}
