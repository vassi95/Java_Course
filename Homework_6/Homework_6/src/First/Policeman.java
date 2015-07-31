package First;
public class Policeman extends Employee {
	protected int rang;

	public Policeman() {
		setHoursPerMonth(0);
		setSalary(0);
		setRang(0);

	}

	public Policeman(int hoursPerMonth, int salary, int rang) {
		setHoursPerMonth(hoursPerMonth);
		setSalary(salary);
		setRang(rang);
	}

	public int getRang() {
		return rang;
	}

	public void setRang(int rang) {
		this.rang = rang;
	}

	public void sayRang() {
		System.out.println("My rang is : " + this.rang);
	}

}
