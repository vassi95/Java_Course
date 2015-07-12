import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		int first, second, third, fourth, sum;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		first = input.nextInt();
		System.out.print("Enter the second number: ");
		second = input.nextInt();
		System.out.print("Enter the third number: ");
		third = input.nextInt();
		System.out.print("Enter the fourth number: ");
		fourth = input.nextInt();
		
		sum = first+second+third+fourth;
		System.out.print("The sum of the numbers is: " + sum);
		input.close();
	}
}
