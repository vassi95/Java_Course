import java.util.Random;

public class MultipleRandomNums {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 20; i++) {
			System.out.println(multiply(rand.nextInt(), rand.nextInt(), rand.nextInt()));
		}

	}

	public static int multiply(int num1, int num2, int num3) {
		return (num1 * num2 * num3);
	}

}
