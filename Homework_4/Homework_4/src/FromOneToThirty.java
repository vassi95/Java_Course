
public class FromOneToThirty {

	public static void main(String[] args) {

		for (int i = 1; i < 31; i++) {
			System.out.printf("%-5d", i);
			if (i % 6 == 0) {
				System.out.println();
			}
		}

	}
}