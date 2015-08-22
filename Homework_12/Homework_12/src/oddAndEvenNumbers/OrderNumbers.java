package oddAndEvenNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrderNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrayOfNums = new int[10];
		System.out.println("Please enter 10 numbers:");
		for (int i = 0; i < 10; i++) {
			arrayOfNums[i] = input.nextInt();
		}
		input.close();
		order(arrayOfNums);
	}

	public static void order(int[] arr) {
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for (int i : arr) {
			if (i % 2 == 0) {
				array1.add(i);
			} else {
				array2.add(i);
			}
		}
		Collections.sort(array1);
		Collections.sort(array2);
		Collections.reverse(array2);
		System.out.println("The even numbers are:");
		for (int i : array1) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("The odd numbers are:");
		for (int i : array2) {
			System.out.println(i);
		}
	}

}
