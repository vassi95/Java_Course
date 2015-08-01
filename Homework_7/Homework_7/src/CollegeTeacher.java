
public class CollegeTeacher extends Teacher implements checkHomeworks {
	private String college;

	public CollegeTeacher() {
		super();
		setCollege("");
	}

	public CollegeTeacher(String firstName, String lastName, int yearsOfExperience, String subject, String college) {
		super(firstName, lastName, yearsOfExperience, subject);
		setCollege(college);
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	@Override
	public void checkHomeworks() {
		System.out.println("I can check homeworks.");
	}

	public void writeArticles() {
		System.out.println("I can write articles about science.");
	}
}