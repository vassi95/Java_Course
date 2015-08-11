package uniqueWords;

import java.util.HashMap;

import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter text: ");
		String text = input.nextLine();
		text = text.toLowerCase();
		input.close();
		String[] strArr = text.split(" | \\.");
		uniqueWords(strArr);
	}

	public static void uniqueWords(String[] array) {
		HashMap<String, Integer> words = new HashMap<String, Integer>();
		for (String word : array) {
			Integer count = words.get(word);
			if (count == null) {
				count = 0;
			}
			words.put(word, count + 1);
		}
		System.out.println("The unique words are: ");
		for (String word : words.keySet()) {
			Integer counter = words.get(word);
			if (counter == 1) {
				System.out.println(word);
			}
		}
	}
}
