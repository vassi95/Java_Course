import java.util.Scanner;
public class Intervals {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first integer: ");
		int num = input.nextInt();
		switch(num){
		case 1:
		case 2:
		case 3:
		case 4:
		case 5: 
			if(num%2==0){
				System.out.println("EVEN");
			}
			else{
				System.out.println("ODD");
			}
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			if(num % 3 == 0){
				System.out.println("The number CAN be divided by 3 without a remainder!");
			}
			else{
				System.out.println("The number CAN'T be devided by 3 without a remainder!");
			}
			break;
		default:
			if(num > 0){
				System.out.println("The number is positive!");
			}
			else if(num < 0){
				System.out.println("The number is negative!");
			}
			else{
				System.out.println("The number is ZERO!");
			}
			break;
		}
		input.close();
	}
}