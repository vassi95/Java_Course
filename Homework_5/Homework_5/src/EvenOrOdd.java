import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print(check(number));
		input.close();
		System.out.println("\n\nHere is a demonstration with several numbers:");
		System.out.println("0 -> " + check(0));
		System.out.println("1 -> " + check(1));
		System.out.println("-20 -> " + check(-20));
		System.out.println("55 -> " + check(55));
		System.out.println("1234 -> " + check(1234));
	}

	public static String check(int num) {
		if (num % 2 == 0) {
			return ("Even");
		}
		return ("Odd");
	}
}
