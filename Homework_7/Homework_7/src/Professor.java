
public class Professor extends Lecturer implements checkHomeworks {
	private String degree;

	public Professor() {
		super();
		setDegree("");
	}

	public Professor(String firstName, String lastName, int yearsOfExperience, String uniName, String degree) {
		super(firstName, lastName, yearsOfExperience, uniName);
		setDegree(degree);
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public void say() {
		System.out.printf("My degree is %s and I have %d years of experience\n", getDegree(), getYearsOfExperience());
	}

	@Override
	public void checkHomeworks() {
		System.out.println("I can check homeworks, too.");
	}

	public void conductExams() {
		System.out.println("I can conduct exams.");
	}

}
