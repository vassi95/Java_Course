package reverse;

import java.util.Scanner;

/* First way: */
public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = input.nextLine();
		System.out.println("The reversed word is: " + new StringBuilder(word).reverse().toString());
		input.close();

	}

	/* Second way: */
	// public class ReverseString {
	//
	// public static void main(String[] args) {
	// Scanner input = new Scanner(System.in);
	// System.out.println("Please enter a word: ");
	// String word = input.nextLine();
	// String reversedWord = "";
	// for(int i=word.length(); i>0; i--) {
	// reversedWord += word.charAt(i-1);
	// }
	// System.out.println("The reversed word is: " + reversedWord);
	// input.close();
	//
	// }

	/* Third way: */
	// public class ReverseString {
	//
	// public static void main(String[] args) {
	// Scanner input = new Scanner(System.in);
	// System.out.println("Please enter a word: ");
	// String word = input.nextLine();
	// String reversedWord = "";
	// char cha[] = word.toCharArray();
	// int k = word.length() - 1;
	// for (int i = 0; k >= i; k--) {
	// reversedWord += cha[k];
	// }
	// System.out.println("The reversed word is: " + reversedWord);
	// input.close();
	// }
}