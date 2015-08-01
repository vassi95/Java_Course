
public class SchoolTeacher extends Teacher implements checkHomeworks {
	String[] array = new String[5];

	public SchoolTeacher() {
		super();
		setArray(null);

	}

	public SchoolTeacher(String firstName, String lastName, int yearsOfExperience, String subject, String[] array) {
		super(firstName, lastName, yearsOfExperience, subject);
		setArray(array);

	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public void entertain() {
		System.out.println("I can entertain children.");
	}

	@Override
	public void checkHomeworks() {
		System.out.println("I can check homeworks!");
	}

	public void sayClasses() {
		System.out.println("Classes:");
		for (int num = 0; num < array.length; num++) {
			System.out.print(" " + array[num]);
		}
		System.out.println();
	}

}