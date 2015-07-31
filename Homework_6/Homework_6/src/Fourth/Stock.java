package Fourth;

public abstract class Stock {
	private double price;
	private boolean availability;

	public Stock() {
		setPrice(0.0);
		setStock(false);
	}

	public Stock(double price, boolean availability) {
		setPrice(price);
		setStock(availability);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isStock() {
		return availability;
	}

	public void setStock(boolean availability) {
		this.availability = availability;
	}

}
