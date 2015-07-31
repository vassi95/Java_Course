package Fourth;

public class Vegetables extends Stock {
	private String name;
	private String season;
	int count = 0;

	public Vegetables() {
		setPrice(0.0);
		setStock(false);
		setName("");
		setSeason("");
	}

	public Vegetables(double price, boolean availability, String name, String season) {
		setPrice(price);
		setStock(availability);
		setName(name);
		setSeason(season);
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	void Available(){
		System.out.println(count);
	}

}
