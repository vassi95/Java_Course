
import java.util.Scanner;
public class SearchForNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = input.nextInt();

		int[] array = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("Enter the number to find");
		int number = input.nextInt();
		for (int i = 0; i < n; i++) {
			if(array[i] == number){
				System.out.println(number + " is at index " + i);
				break;				
			}
			}
		input.close();

	}

}
