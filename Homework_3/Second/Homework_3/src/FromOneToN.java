import java.util.Scanner;

public class FromOneToN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter \"N\": ");
		int n = input.nextInt();
		for (int i = 1; i < n + 1; i++) {
			System.out.println(i);
		}
		input.close();
	}

}
