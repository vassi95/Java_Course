package myPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SquareMatrix {

	public int size;
	public int[][] matrix;
	public int[][] rotatedMatrix;

	Scanner input = new Scanner(System.in);

	public SquareMatrix() {
		super();
	}

	public SquareMatrix(int size, int[][] matrix, int[][] rotatedMatrix) {
		super();
		this.size = size;
		this.matrix = matrix;
		this.rotatedMatrix = rotatedMatrix;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public void setMatrix(int[][] matrix) {
		this.matrix = matrix;
	}

	public int[][] getRotatedMatrix() {
		return rotatedMatrix;
	}

	public void setRotatedMatrix(int[][] rotatedMatrix) {
		this.rotatedMatrix = rotatedMatrix;
	}

	public int[][] fillMatrix() {

		System.out.println("Enter th size of the matrix(NxN) -> a number from 2 to 9!");
		byte size = input.nextByte();
		if (size < 2 || size > 9) {
			System.out.println("Wrong value! The size must be a number from 2-9! Please try again!");
			System.exit(0);
		}

		int[][] matrix = new int[size][size];
		System.out.print("Enter the elements of a matrix:");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = input.nextInt();
			}

		}

		setMatrix(matrix);
		return matrix;
	}

	public int[][] rotateMatrix(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int[][] rotated = new int[col][row];
		for (int i = 0; i < col; ++i) {
			for (int j = 0; j < row; ++j) {
				rotated[i][j] = matrix[row - j - 1][i];
			}
		}
		setRotatedMatrix(rotated);
		return rotated;
	}

	public void writeMatrixInFile(int[][] matrix) {

		String path = "../rotatedMatrix.txt";

		try {
			FileWriter fileStream = new FileWriter(path);
			BufferedWriter writer = new BufferedWriter(fileStream);
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					writer.write(Integer.toString(matrix[i][j]) + " ");
				}
				writer.newLine();

			}
			writer.close();
		} catch (Exception e) {
			System.out.println("Error while writing a file!!!");
			System.out.println(e.getMessage());
		}
	}

	public void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix[0].length; row++) {
			for (int col = 0; col < matrix[0].length; col++) {
				System.out.printf("%-5d", matrix[row][col]);
			}
			System.out.print("\n");
		}
	}

	public byte choise() {

		System.out.println("Please choose between:\n\n");
		System.out.println(
				"1. Rotate the matrix and write it into file.\n2.Find the sum of the biggest numbers on each row,column and diagonals.\n0. Exit.");
		byte choise = input.nextByte();
		return choise;
	}

	public int findBiggestNumbers(int[][] matrix) {
		int sum = 0;

		/* Finds the biggest of each line */
		for (int i = 0; i < matrix.length; i++) {
			int maxInRow = matrix[i][0];
			for (int j = 0; j < matrix[i].length; j++) {

				if (maxInRow < matrix[i][j]) {
					maxInRow = matrix[i][j];
				}
			}
			sum += maxInRow;
			maxInRow = matrix[i][0];
		}

		/* Finds the biggest of each column */
		for (int i = 0; i < matrix[0].length; i++) {
			int maxInCol = matrix[0][i];
			for (int j = 0; j < matrix.length; j++) {

				if (maxInCol < matrix[j][i]) {
					maxInCol = matrix[j][i];
				}
			}
			sum += maxInCol;
			maxInCol = matrix[0][i];
		}

		/* Finds the biggest of the main diagonal */
		int maxInMainDiag = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			if (maxInMainDiag < matrix[i][i]) {
				maxInMainDiag = matrix[i][i];
			}
		}
		sum += maxInMainDiag;

		/* Finds the biggest of the secondary diagonal */
		int maxInSecDiag = 0;
		for (int i = 0; i < matrix[0].length; i++) {

			if (maxInSecDiag < matrix[matrix[0].length - i - 1][i]) {
				maxInSecDiag = matrix[matrix[0].length - i - 1][i];
			}
		}
		sum += maxInSecDiag;
		return sum;

	}

}
