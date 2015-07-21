import java.util.Scanner;

public class TwoNumbersAB {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter \"a\":");
		int a = input.nextInt();
		System.out.println("Enter \"b\":");
		int b = input.nextInt();
		if( a> b){
			System.out.print("\"a\" have to be smaller than \"b\"! The numbers will be swapped!\n");
			int temp;
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("\nThe numbers are: ");
		for(int num= a; num<=b; num++ ){
			if(num % 3 == 0){
				System.out.print(" " + num);
			}
		}
		input.close();

	}

}
