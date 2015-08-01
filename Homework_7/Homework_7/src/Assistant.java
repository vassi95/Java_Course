
public class Assistant extends Lecturer implements checkHomeworks {
	private boolean isChief;

	public Assistant() {
		super();
		setChief(false);
	}

	public Assistant(String firstName, String lastName, int yearsOfExperience, String uniName, boolean isChief) {
		super(firstName, lastName, yearsOfExperience, uniName);
		setChief(isChief);
	}

	public boolean isChief() {
		return isChief;
	}

	public void setChief(boolean isChief) {
		this.isChief = isChief;
	}

	@Override
	public void checkHomeworks() {
		System.out.println("I can check the homeworks of all groups!");
	}

	public void writeArticles() {
		System.out.println("I can write articles about science! ");
	}

	public void checkExams() {
		System.out.println("I can check exams!");
	}

	public void say() {
		System.out.printf("Hello! My name is %s %s", getFirstName(), getLastName());
		if (isChief() == true) {
			System.out.println("and I am chief assistant");
		} else {
			System.out.println("and I am not chief assistant");
		}
	}

}
