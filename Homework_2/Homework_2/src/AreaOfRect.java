import java.util.Scanner;

public class AreaOfRect {

	public static void main(String[] args) {
		float length, width, area;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		length = input.nextFloat();
		System.out.print("Enter the width of the rectangle: ");
		width = input.nextFloat();
		area = length * width;
		System.out.print("The area of the rectangle is: " + area);
		input.close();
	}

}
