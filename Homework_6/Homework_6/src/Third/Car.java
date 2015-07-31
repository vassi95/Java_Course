package Third;

public class Car {
	private int price;

	public Car() {
		setPrice(0);
	}

	public Car(int price) {
		setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void sayPrice() {
		System.out.print("\nPrice: " + this.price);
	}

	public void sayFuel() {
	}

	public void sayOffRoad() {

	}
}
