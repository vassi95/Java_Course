package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class NumbersPlusMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Stack<Character> newStack = new Stack<Character>();
		Queue<Character> newQueue = new LinkedList<Character>();
		
		System.out.println("Please enter a valid string! \nIt must contain only digits, + and - .");
		String newStr = input.nextLine();
		
		if (checkForNumsAndOper(newStr) == true && checkStartEnd(newStr) == true && checkForCouples(newStr) == false) {
			char[] newArr = newStr.toCharArray();
			
			for (int i = 0; i < newArr.length; i++) {
				if (Character.isDigit(newArr[i])) {
					newQueue.offer(newArr[i]);
				} else if (newArr[i] == '+' || newArr[i] == '-') {
					newStack.push(newArr[i]);
				}
			}
			
			System.out.println("The stack and the queue at the beginning:");
			print(newStack, newQueue);
			int res = doTheOperation(newQueue.poll(), newQueue.poll(), newStack.pop());
			newQueue.offer((char) res);
			
			System.out.println("\nThe result of the operation is: " + res);
			System.out.println("\nThe stack and the queue at the end:");
			print(newStack, newQueue);
			
		} else {
			System.out.println("The entered string is not valid!Please try again!");
		}
		input.close();
	}

	private static boolean checkForNumsAndOper(String input) {
		char[] newStr = input.toCharArray();
		boolean contains = false;
		
		for (int i = 0; i < newStr.length; i++) {
			if (Character.isDigit(newStr[i]) || newStr[i] == '+' || newStr[i] == '-') {
				contains = true;
			} else {
				contains = false;
			}
		}
		return contains;
	}

	private static boolean checkForCouples(String input) {
		char[] newStr = input.toCharArray();
		boolean couples = false;
		
		for (int i = 1; i < newStr.length; i++) {
			if (newStr[i - 1] == newStr[i]) {
				couples = true;
			}
		}
		return couples;
	}

	private static boolean checkStartEnd(String input) {
		char[] newStr = input.toCharArray();
		boolean ok = false;
		
		if (Character.isDigit(newStr[0]) && Character.isDigit(newStr[newStr.length - 1])) {
			ok = true;
		}
		return ok;
	}

	public static void print(Stack<Character> st, Queue<Character> que) {
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		System.out.println();
		for (Character s : que) {
			System.out.println(s);
		}
	}

	public static int doTheOperation(char a, char b, char operator) {
		int first = Character.getNumericValue(a);
		int second = Character.getNumericValue(b);
		
		if (operator == '+') {
			return first + second;
		} else if (operator == '-') {
			return first - second;
		}
		return 0;
	}
}
