package First;
public class Test {

	public static void main(String[] args) {
		Employee gosho = new Employee(40, 500);
		Policeman pesho = new Policeman(50, 600, 10);
		Doctor tosho = new Doctor(60, 700, 10, 12);

		gosho.sayHours();
		gosho.saySalary();
		System.out.println();
		
		pesho.sayHours();
		pesho.saySalary();
		pesho.sayRang();
		System.out.println();
		
		tosho.sayHours();
		tosho.saySalary();
		tosho.sayNightDuties();
		tosho.sayDayDuties();

	}

}
