import java.util.Scanner;
public class TheBiggestOf5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max = 0;
		int num;
		System.out.println("Enter 5 numbers: ");
		for(int i=0; i<5; i++){
			num = input.nextInt();
			if(num>max){
				max=num;
			}
		}
		System.out.println("The max number is: " +max);
		input.close();
	}

}

//The same program working with double numbers
/*import java.util.Scanner;
public class TheBiggestOf5 {

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double max = 0.0;
	double num;
	System.out.println("Enter 5 numbers: ");
	for(int i=0; i<5; i++){
		num = input.nextDouble();
		if(num>max){
			max=num;
		}
	}
	System.out.println("The max number is: " +max);
	input.close();
}

}
*/
