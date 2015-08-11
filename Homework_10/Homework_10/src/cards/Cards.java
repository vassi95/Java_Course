package cards;

import java.util.HashMap;
import java.util.Scanner;

public class Cards {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 5 cards: ");
		String[] cards = new String[5];
		for (int i = 0; i < 5; i++) {
			cards[i] = input.nextLine();
			if (!((cards[i].equals("2")) || (cards[i].equals("3")) || (cards[i].equals("4")) || (cards[i].equals("5"))
					|| (cards[i].equals("6")) || (cards[i].equals("7")) || (cards[i].equals("8"))
					|| (cards[i].equals("9")) || (cards[i].equals("10")) || (cards[i].equals("A"))
					|| (cards[i].equals("J")) || (cards[i].equals("K")) || (cards[i].equals("Q")))) {
				System.out.println("Invalid card! Please try again!");
				return;
			}
			input.close();
		}

		countCards(cards);
	}

	public static void countCards(String[] array) {
		HashMap<String, Integer> cards = new HashMap<String, Integer>();
		for (String card : array) {
			Integer count = cards.get(card);
			if (count == null) {
				count = 0;
			}
			cards.put(card, count + 1);
		}
		System.out.println("You have : ");
		for (String card : cards.keySet()) {
			Integer counter = cards.get(card);
			if (counter == 2) {
				System.out.printf("PAIR of %s", card);
			} else if (counter == 3) {
				System.out.printf("SET of %s", card);
			} else if (counter == 4) {
				System.out.printf("QUADS of %s", card);
			} else {
				continue;
			}
		}
	}
}
