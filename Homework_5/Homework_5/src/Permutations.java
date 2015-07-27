import java.util.Arrays;
import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = input.nextInt();
		System.out.println("The possible permutations are:");
		printPermutation(makeArray(n), n, 0);
		input.close();
	}

	public static void printPermutation(int[] arr, int n, int i) {
		if (i == n) { 
			System.out.println(Arrays.toString(arr));

		} else {
			for (int j = i; j < n; j++) {
				swapNums(arr, i, j);
				printPermutation(arr, n, i + 1);
				swapNums(arr, i, j);
 
			}
		}
	}
	
	public static int[] makeArray(int n){
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		return arr;
	}
	
	public static void swapNums(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

