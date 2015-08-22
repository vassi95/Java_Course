package quickSort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrayOfNums = new int[10];
		System.out.println("Please enter 10 numbers:");
		for (int i = 0; i < 10; i++) {
			arrayOfNums[i] = input.nextInt();
		}
		input.close();
		quickSort(arrayOfNums, 0, arrayOfNums.length - 1);
		System.out.println("After Quick Sort the array is: ");
		for (int elem : arrayOfNums) {
			System.out.print(" " + elem);
		}

	}

	public static void quickSort(int[] arr, int beg, int end) {

		int pivot = beg + (end - beg) / 2;
		int value = arr[pivot];
		int i = beg, j = end;
		while (i <= j) {
			while (arr[i] < value) {
				i++;
			}
			while (arr[j] > value) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if (beg < i) {
				quickSort(arr, beg, j);
			}
			if (end > i) {
				quickSort(arr, i, end);
			}
		}
	}
}
