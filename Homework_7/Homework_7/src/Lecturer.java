
public class Lecturer extends Person implements checkHomeworks {
	private String uniName;
	private final int maxLektions = 10;

	public Lecturer() {
		setFirstName("");
		setLastName("");
		setYearsOfExperience(0);
		setUniName("");
	}

	public Lecturer(String firstName, String lastName, int yearsOfExperience, String uniName) {
		this();
		setFirstName(firstName);
		setLastName(lastName);
		setYearsOfExperience(yearsOfExperience);
		setUniName(uniName);
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public int getMaxLektions() {
		return maxLektions;
	}

	public void sayHello() {
		System.out.println("Hello, everyone!");
	}

	public void sayMaxLektions() {
		System.out.printf("I have maximum %d lektions per week!\n", maxLektions);
	}

	@Override
	public void checkHomeworks() {
		System.out.println("Homeworks are checked!");
	}

	public void exercises(String subject) {
		System.out.printf("I'm going to do some exercises on %s\n", subject);
	}

	public void exercises(String subject, int hours) {
		System.out.printf("I'm going to do some exercises on %s and they will take about %d hours.\n", subject, hours);
	}

	public void exercises(String subject, int hours, int group) {
		System.out.printf("I'm going to do some exercises on %s with %d group and they will \ntake about %d hours.\n",
				subject, hours, group);
	}

}
