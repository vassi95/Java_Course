package Fourth;

public class Desserts extends Stock {
	private int calories;
	private boolean isChocolate;
	int count = 0;

	public Desserts() {
		setPrice(0.0);
		setStock(false);
		setCalories(0);
		setChocolate(false);
	}

	public Desserts(double price, boolean availability, int calories, boolean isCohocolate) {
		setPrice(price);
		setStock(availability);
		setCalories(calories);
		setChocolate(isChocolate);
		count++;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public boolean isChocolate() {
		return isChocolate;
	}

	public void setChocolate(boolean isChocolate) {
		this.isChocolate = isChocolate;
	}
	void Available(){
		System.out.println(count);
	}

}
