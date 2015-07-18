import java.util.Scanner;
public class BonusPoints {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your points (0-9)!:");
		int points = input.nextInt();
		switch(points){
		case 1:
		case 2:
		case 3:
			points *= 5;
			break;
		case 4:
		case 5:
		case 6:
			points *= 10;
			break;
		case 7:
		case 8:
		case 9:
			points *= 50;
			break;
		default:
			System.out.println("You can enter only points from 1 to 9!");
		}
		System.out.println("Your points are: " + points);
		input.close();
	}

}
