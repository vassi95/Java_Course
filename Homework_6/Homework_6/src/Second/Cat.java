package Second;

public class Cat {
	protected String name;
	protected int years;

	public Cat() {
		setName("");
		setYears(0);
	}

	public Cat(String name, int years) {
		setName(name);
		setYears(years);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}
	
	public void Say(){
		System.out.print("Hi! My name is " + this.name);
		System.out.printf(". I am %d years old.\n", this.years);
	}

}