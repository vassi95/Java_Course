
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();

		int[] array = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - 1); j++) {
				if (array[j] > array[j + 1]) {
					array[j] = array[j] + array[j + 1];
					array[j + 1] = array[j] - array[j + 1];
					array[j] = array[j] - array[j + 1];

				}
			}

		}
		System.out.println("After Bubble Sort the array is: ");
		for (int i : array) {
			System.out.print(" " + i);

		}
		input.close();
	}
}