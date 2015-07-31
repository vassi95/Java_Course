package Third;

public class SUV extends Car {
	private boolean isPassable;

	public SUV() {
		setPrice(0);
		setPassable(false);
	}

	public SUV(int price, boolean isPassable) {
		setPrice(price);
		setPassable(isPassable);
	}

	public boolean isPassable() {
		return isPassable;
	}

	public void setPassable(boolean isPassable) {
		this.isPassable = isPassable;
	}

	public void sayOffRoad() {
		if (this.isPassable == true) {
			System.out.println(" The automobile is off-road.");
		} else {
			System.out.println(" The automobile is not  off-road.");
		}
	}

}
