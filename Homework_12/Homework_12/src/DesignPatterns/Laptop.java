package DesignPatterns;

public class Laptop extends Device {
	private String ram;
	private String operatingSystem;

	public Laptop() {
		super();
		setModel("");
		setBrand("");
		setRam("");
		setOperatingSystem("");
	}

	public Laptop(String model, String brand, String ram, String operatingSystem) {
		super();
		setModel(model);
		setBrand(brand);
		setRam(ram);
		setOperatingSystem(operatingSystem);
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String opratingSystem) {
		this.operatingSystem = opratingSystem;
	}

	@Override
	public void deviceInfo() {
		System.out.printf("Model: %s | Brand: %s | Ram: %s | Operating System: %s ", super.model, getBrand(),
				getRam(), getOperatingSystem());
	}

}