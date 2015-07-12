import java.util.Scanner;
public class AreaOfTriange {

	public static void main(String[] args) {
		int side, height, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of a side: ");
		side = input.nextInt();
		System.out.print("Enter the height of the triangle: ");
		height = input.nextInt();
		area = side*height/2;
		
		System.out.print("The area of the triangle is: " + area);
		input.close();

	}

}
