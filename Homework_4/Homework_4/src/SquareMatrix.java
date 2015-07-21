
import java.util.Scanner;

public class SquareMatrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 1;
		System.out.print("Enter the number of rows( rows = columns):");
		int n = input.nextInt();
		int[][] matrix = new int[n][n];

		for (int col = 0; col < n; col++) {
			for (int row = 0; row < n; row++) {
				matrix[row][col] = num;
				num++;
			}
		}
		System.out.print("\n Vertical matrix: \n");
		for (int col = 0; col < n; col++) {
			for (int row = 0; row < n; row++) {
				System.out.printf("%-5d", matrix[col][row]);

			}
			System.out.print("\n");
		}

		num = 1;
		System.out.print("\n Horizontal matrix: \n");
		for (int col = 0; col < n; col++) {
			for (int row = 0; row < n; row++) {
				matrix[col][row] = num;
				num++;
			}
		}
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {

				System.out.printf("%-5d", matrix[row][col]);
			}
			System.out.print("\n");
		}

		input.close();

	}

}
