
public abstract class Person {
	protected String firstName;
	protected String lastName;
	protected int yearsOfExperience;
	static int counter = 0;

	public Person() {
		setFirstName("");
		setLastName("");
		setYearsOfExperience(0);
		counter++;
	}

	public Person(String firstName, String lastName, int yearsOfExperience) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
		setYearsOfExperience(yearsOfExperience);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (yearsOfExperience > 0) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

}
