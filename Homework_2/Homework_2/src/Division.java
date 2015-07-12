import java.util.Scanner;
public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numForCheck;
		boolean result;
		System.out.println("Enter a number: ");
		numForCheck = input.nextInt();
	
		result = (numForCheck % 5 == 0 && numForCheck % 7 == 0);
		System.out.print("The result is: ");
		System.out.println(result);
		input.close();

	}

}
