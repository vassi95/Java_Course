package Fourth;

public class Drinks extends Stock {
	private String name;
	private int quantity;
	int count = 0;

	public Drinks() {
		setPrice(0.0);
		setStock(false);
		setName("");
		setQuantity(0);
	}

	public Drinks(double price, boolean availability, String name, int quantity) {
		setPrice(price);
		setStock(availability);
		setName(name);
		setQuantity(quantity);
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void Available(){
		System.out.println(count);
	}

}
