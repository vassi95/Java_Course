package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

public class SentenceBackwards {

	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String text = input.nextLine();
		String[] arrayOfWords = text.split(" ");
		for (String word : arrayOfWords) {
			myStack.push(word);
		}
		print(myStack);
		input.close();
	}

	public static void print(Stack<String> stack) {
		while (!stack.isEmpty()) {
			String element = stack.pop();
			System.out.print(element + " ");
		}
	}

}
