package DesignPatterns;

public class Phone extends Device {
	private String memory;

	public Phone() {
		super();
		setBrand("");
		setModel("");
		setMemory("");
	}

	public Phone(String brand, String model, String memory) {
		super();
		setBrand(brand);
		setModel(model);
		setMemory(memory);
	
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}


	@Override
	public void deviceInfo() {
		System.out.printf("Model: %s | Brand: %s | Memory: %s ", getModel(), getBrand(), getMemory());
	}

}
