import java.util.Scanner;
public class TheBiggestOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		double num1 = input.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = input.nextDouble();
		System.out.println("Enter the third number: ");
		double num3 = input.nextDouble();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("The biggest number is: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("The biggest number is: " + num2);
		}
		else{
			System.out.println("The biggest number is: " + num3);
		}
		input.close();

	}

}

// The same program working with integers: 
/*import java.util.Scanner;
public class TheBiggestOfThree {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		System.out.println("Enter the third number: ");
		int num3 = input.nextInt();
		
		if(num1 > num2 && num1 > num3){
			System.out.println("The biggest number is: " + num1);
		}
		else if(num2 > num1 && num2 > num3){
			System.out.println("The biggest number is: " + num2);
		}
		else{
			System.out.println("The biggest number is: " + num3);
		}
		input.close();

	}

}*/
