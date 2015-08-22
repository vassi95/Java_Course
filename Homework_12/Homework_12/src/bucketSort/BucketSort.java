package bucketSort;

import java.util.Scanner;

public class BucketSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrayOfNums = new int[10];
		System.out.println("Please enter 10 numbers:");
		for (int i = 0; i < 10; i++) {
			arrayOfNums[i] = input.nextInt();
		}
		input.close();
		bucketSort(arrayOfNums);

	}

	public static void bucketSort(int[] arr) {
		int[] bucket = new int[100];
		for (int i = 0; i < arr.length; i++)
			bucket[arr[i]]++;
		int j = 0;
		for (int i = 0; i < bucket.length - 1; i++) {
			if (bucket[i] > 0)
				arr[j++] = i;
		}
		System.out.println("After Bucket Sort the array is: ");
		for (int i : arr) {
			System.out.print(" " + i);
		}
	}
}
