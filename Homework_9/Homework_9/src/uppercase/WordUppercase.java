package uppercase;

import java.util.Scanner;

public class WordUppercase {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = input.nextLine();
		System.out.println("Please enter text: ");
		String text = input.nextLine();
		String neww = text.replaceAll(word, word.toUpperCase());
		System.out.println(neww);
		input.close();

	}

}