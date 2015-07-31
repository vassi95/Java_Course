package Fourth;

public class Fruits extends Stock {

	private String kind;
	private boolean tropical;
	int count = 0;

	public Fruits() {
		setPrice(0.0);
		setStock(false);
		setKind("");
		setTropical(false);
	}

	public Fruits(double price, boolean availability, String type, boolean tropical) {
		setPrice(price);
		setStock(availability);
		setKind(kind);
		setTropical(tropical);
		count++;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public boolean getTropical() {
		return tropical;
	}

	public void setTropical(boolean tropical) {
		this.tropical = tropical;
	}
	void Available(){
		System.out.println(count);
	}

}
