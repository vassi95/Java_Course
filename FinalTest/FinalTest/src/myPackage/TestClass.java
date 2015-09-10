package myPackage;

public class TestClass {

	public static void main(String[] args) {

		SquareMatrix matr = new SquareMatrix();
		int[][] initial = matr.fillMatrix();

		for (;;) {
			byte choise = matr.choise();
			switch (choise) {
			case 1:
				int[][] rotated = matr.rotateMatrix(initial);
				System.out.println("The initial matrix is:\n");
				matr.printMatrix(initial);
				System.out.println();
				System.out.println("The rotated matrix is:\n");
				matr.printMatrix(rotated);
				System.out.println();
				matr.writeMatrixInFile(rotated);
				break;
			case 2:
				System.out.println();
				System.out.println("The sum is: " + matr.findBiggestNumbers(initial));
				System.out.println();
				break;
			case 0:
				matr.input.close();
				System.exit(0);
				break;
			}
		}
	}
}