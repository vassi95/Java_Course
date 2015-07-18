import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int sum = 0;
		while(flag){
			System.out.println("Enter a number ( 0 for exit) : ");
			int number = input.nextInt();
			
			if(number == 0){
				flag = false;
			}
			else{
				sum += number;
			}
		}
		System.out.print("The sum is: " + sum);
		input.close();
	}

}


//import java.util.Scanner;
//public class SumOfNumbers {
//
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		int sum = 0;
//		while(true){
//			System.out.println("Enter a number ( 0 for exit) : ");
//			int number = input.nextInt();
//			
//			if(number == 0){
//				break;
//			}
//			else{
//				sum += number;
//			}
//		}
//		System.out.print("The sum is: " + sum);
//		input.close();
//	}
//
//}
