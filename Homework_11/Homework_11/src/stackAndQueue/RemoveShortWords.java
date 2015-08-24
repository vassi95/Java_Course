package stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class RemoveShortWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Queue<String> myQueue = new LinkedList<String>();
		System.out.println("Please enter a sentence:");
		String text = input.nextLine();
		String[] array = text.split(" ");
		for (String word : array) {
			if (word.length() <= 3) {
				continue;
			}
			myQueue.offer(word);
		}
		print(myQueue);
		input.close();

	}

	public static void print(Queue<String> queue) {
		while (!queue.isEmpty()) {
			String element = queue.poll();
			System.out.print(element + " ");
		}
	}
}
