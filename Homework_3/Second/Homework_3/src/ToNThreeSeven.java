import java.util.Scanner;

public class ToNThreeSeven {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter \"N\": ");
		int n = input.nextInt();

		for (int i = 1; i < n + 1; i++) {
			if (i % 3 != 0 && i % 7 != 0) {
				System.out.println(i);
			}
		}
		input.close();

	}

}
