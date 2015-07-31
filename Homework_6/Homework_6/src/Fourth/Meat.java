package Fourth;

public class Meat extends Stock {
	protected String type;
	protected double weight;
	int count = 0;

	
	public Meat() {
		setPrice(0.0);
		setStock(false);
		setType("");
		setWeight(0.0);
	}

	public Meat(double price, boolean availability, String type, double weight) {
		setPrice(price);
		setStock(availability);
		setType(type);
		setWeight(weight);
		count++;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	void Available(){
		System.out.println(count);
	}

}
