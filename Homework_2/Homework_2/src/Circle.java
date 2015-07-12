import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		float radius, perimeter, area;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		radius = input.nextFloat();
		
		perimeter = (float) (2 * Math.PI * radius);
		area = (float) (Math.PI * radius * radius);
		
        System.out.printf("The perimeter of the circle is %.3f\n" , perimeter);
        System.out.printf("The area of the circle is %.3f" , area);
        input.close();

	}

}
