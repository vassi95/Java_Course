import java.util.Scanner;
public class Cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a symbol!:");
		String symbol = input.nextLine();
		switch(symbol.toUpperCase()){
		case "1":
		case "2":
		case "3":
		case "4":
		case "5":
		case "6":
		case "7":
		case "8":
		case "9":
		case "10":
		case "J":
		case "Q":
		case "K":
		case "A":
			System.out.println("This is a valid card!");
			break;
		default:
			System.out.println("This is NOT a valid card!");
		
		}
		input.close();

	}

}