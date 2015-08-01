
public class TestClass {
	public static void main(String[] args) {
		String[] array = {"2A", "4B", "8A", "11B", "3A"};
		Teacher teacher = new Teacher("Asen", "Ivanov", 5, "Math");
		Teacher teacher1 = new Teacher("Dragan", "Iordanov", 8, "Art");
		Lecturer lecturer = new Lecturer("Georgi", "Nikolaev", 10, "Technical University");
		SchoolTeacher schoolTeacher = new SchoolTeacher("Ivan", "Ivanov", 5, "Math", array);
		CollegeTeacher collegeTeacher = new CollegeTeacher("Kaloqn", "Dimitrov", 15, "Physics", "X college");
		Professor professor = new Professor("Petur", "Iliev", 10, "Sofia University", "head");
		Assistant assistant = new Assistant("Dimitur", "Nikolov", 6, "Technical University", true);
		Assistant assistant1 = new Assistant("Mariqn", "Georgiev", 2, "UNSS", false);
		
		System.out.println();
		System.out.printf("There are %d instances made.\n" ,Person.counter);
		System.out.println();
		teacher.sayHello();
		teacher.checkHomeworks();
		teacher.sayGoodbye();
		System.out.println();
		teacher1.sayHello();
		teacher1.checkHomeworks();
		teacher1.sayGoodbye();
		System.out.println();
		System.out.println();
		lecturer.sayHello();
		lecturer.checkHomeworks();
		lecturer.sayMaxLektions();
		lecturer.exercises("Math");
		lecturer.exercises("history", 5);
		lecturer.exercises("English", 4, 3);
		System.out.println();
		System.out.println();
		schoolTeacher.sayClasses();
		schoolTeacher.entertain();
		schoolTeacher.checkHomeworks();
		System.out.println();
		System.out.println();
		collegeTeacher.writeArticles();
		collegeTeacher.checkHomeworks();
		System.out.println();
		System.out.println();
		professor.say();
		professor.conductExams();
		professor.checkHomeworks();
		System.out.println();
		System.out.println();
		assistant.say();
		assistant.checkHomeworks();
		assistant.checkExams();
		assistant.writeArticles();
		System.out.println();
		assistant1.say();
		assistant1.checkHomeworks();
		assistant1.checkExams();
		assistant1.writeArticles();
				
	}
}