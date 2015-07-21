
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();
		
		long[] array = new long[n];
		array[0] = 0;
		array[1] = 1;
		for (int i = 2; i < n; i++) {
			array[i] = array[i-2] + array[i-1];
		}
		
		input.close();
        System.out.println(Arrays.toString(array));
	}

}
