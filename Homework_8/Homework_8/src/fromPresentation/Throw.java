package fromPresentation;

public class Throw {

	public static void main(String[] args) {

		try {

			User user1 = new User("blabla@abv.bg", "15sfss");
			// User user2 = new User("asadadabg", "54ds32f");
			// User user3 = new User("kndksd@mail.bg", "df7");
			System.out.println("Everything is OK :) ");

		} catch (IllegalArgumentException exception) {
			System.out.println("An error: " + exception.getMessage());
		}
	}

}
