import java.util.Arrays;
import java.util.Scanner;

public class ReverseValues {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();
		
		int[] array = new int[n];
		int[] reversedArray = new int[array.length];
		
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}
		
		for (int i = 0; i < array.length ; i++) {
			reversedArray[i] = array[n - i - 1];
		}

		input.close();
		System.out.print(Arrays.toString(reversedArray));
	}

}