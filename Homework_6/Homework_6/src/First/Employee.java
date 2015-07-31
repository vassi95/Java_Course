package First;

public class Employee {
	protected int hoursPerMonth;
	protected int salary;

	public Employee() {
		setHoursPerMonth(0);
		setSalary(0);
	}

	public Employee(int hoursPerMonth, int salary) {
		setHoursPerMonth(hoursPerMonth);
		setSalary(salary);
	}

	public int getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void sayHours() {
		System.out.printf("I have worked %d hours this month\n", this.hoursPerMonth);

	}

	public void saySalary() {
		System.out.println("My month salary is : " + this.salary);
	}

}
