public class SymmetricNumbers {

	public static void main(String[] args) {
		for (int i = 10; i < 1000; i++) {
			System.out.print(symmetric(i).trim());

		}
	}

	public static String symmetric(int number) {
		if (number > 99) {
			int hundreds = (number / 100);
			int remaining = number % 10;
			if (hundreds == remaining) {
				String num = String.valueOf(number);
				System.out.println();
				return num;
			}
		}

		int tens = (number / 10);
		int ones = number % 10;
		if (ones == tens) {
			String num = String.valueOf(number);
			System.out.println();
			return num;
		}
		return "";

	}

}
