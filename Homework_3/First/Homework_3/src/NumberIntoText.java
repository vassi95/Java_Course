import java.util.Scanner;

public class NumberIntoText {

	public static void main(String[] args) {
		String ones[] = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
		String tens[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", " ninety" };
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int number = input.nextInt();
		if (number <= 0 || number > 999) {
			System.out.println("Enter a POSITIVE number (from 1 to 999)!");
		} else {
			int hundreds = (number / 100) % 10;
			if (hundreds > 0) {
				System.out.print(ones[hundreds] + " hundred ");
			}
			int remaining = number % 100;
			if (remaining > 19) {
				System.out.print(tens[remaining / 10] + "-" + ones[remaining % 10]);
			} else {
				System.out.print(ones[remaining]);
			}
		}
		input.close();
	}
}