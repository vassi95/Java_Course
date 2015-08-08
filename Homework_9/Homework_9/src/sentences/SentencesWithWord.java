package sentences;

import java.util.Scanner;

public class SentencesWithWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter text: ");
		String text = input.nextLine();
		System.out.println("Please enter a word: ");
		String word = input.nextLine();
		String[] strArr = text.toLowerCase().split("\\.");
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].contains(word)) {
				System.out.print(strArr[i] + ".");
			}
		}
		input.close();
	}
}