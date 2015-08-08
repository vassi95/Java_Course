package sentence;
import java.util.Scanner;

public class Sentence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a sentence:");
		String sentence = input.nextLine();
		boolean beginning = sentence.startsWith("Greeting");
		boolean end = sentence.endsWith(".");
		boolean contain = sentence.contains("water");
		input.close();
		if (beginning) {
			System.out.println("The sentense begins with \"Greeting\"");
		} else {
			System.out.println("The sentense doesn't begin with \"Greeting\"");
		}
		if (end) {
			System.out.println("The sentense ends with \".\"");
		} else {
			System.out.println("The sentense doesn't end with \".\"");
		}
		if (contain) {
			System.out.println("The sentense contains \"water\"");
		} else {
			System.out.println("The sentense doesn't contain \"water\"");
		}
	}
}