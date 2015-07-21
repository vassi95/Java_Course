import java.util.Scanner;

public class SpiralMatrixFilling {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rols/cols : ");
		int n = input.nextInt();
		int matrix[][] = new int[n][n];

		int xStart = 0;
		int xEnd = n - 1;
		int yStart = 0;
		int yEnd = n - 1;
		int position = 1;

		while (position <= n * n) {
			for (int col = xStart; col <= xEnd; col++) {

				matrix[yStart][col] = position++;
			}
			yStart++;
			for (int row = yStart; row <= yEnd; row++) {
				matrix[row][xEnd] = position++;
			}
			xEnd--;

			for (int col = xEnd; col >= xStart; col--) {
				matrix[yEnd][col] = position++;
			}
			yEnd--;

			for (int row = yEnd; row >= yStart; row--) {
				matrix[row][xStart] = position++;
			}
			xStart++;
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