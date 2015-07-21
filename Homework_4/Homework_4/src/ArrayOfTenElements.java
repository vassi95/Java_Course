
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfTenElements {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {
			array[i] = i*10;
		}
		
		input.close();
        System.out.println(Arrays.toString(array));
	}

}
