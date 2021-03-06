import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringMethod {

	public static void main(String[] args) {
		int[] arrayOfNums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("The original array is: ");
		System.out.println(Arrays.toString(arrayOfNums));
		System.out.println("\nThe new array is: ");
		System.out.println(Arrays.toString(viceVersa(arrayOfNums)));
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter a string: ");
		String str = input.nextLine();
		
		System.out.println("The original string is: ");
		System.out.println(str);
		System.out.println("\nThe new string is: ");
		System.out.println(viceVersa(str));
		
		input.close();

	}

	public static int[] viceVersa(int[] array) {
		int[] newArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - i - 1];
		}
		return newArray;
	}

	public static String viceVersa(String strParam) {
		String newStr = "";
		for (int i = strParam.length() - 1; i >= 0; i--) {
			newStr += strParam.charAt(i);
		}
		return newStr;
	}

}
