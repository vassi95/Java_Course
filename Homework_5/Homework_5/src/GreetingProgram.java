import java.util.Scanner;

public class GreetingProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Your name is: ");
		String name = input.nextLine();
		System.out.print(print(name));
		input.close();

	}

	public static String print(String str) {
		return ("\nGreeting, " + str + " !");
	}

}
