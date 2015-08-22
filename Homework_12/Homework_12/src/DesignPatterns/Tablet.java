package DesignPatterns;

public class Tablet extends Device {
	private String colour;
	private String inches;
	private String processor;

	
	
	public Tablet() {
		super();
		setModel("");
		setBrand("");
		setColour("");
		setInches("");
		setProcessor("");
	}

	public Tablet(String model, String brand, String colour, String inches, String processor) {
		super();
		setModel(model);
		setBrand(brand);
		setColour(colour);
		setInches(inches);
		setProcessor(processor);
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getInches() {
		return inches;
	}

	public void setInches(String inches) {
		this.inches = inches;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public void deviceInfo() {
		System.out.printf("Model: %s | Brand: %s | Processor: %s | Inches: %s | Colour: %s", getModel(), getBrand(),
				getProcessor(), getInches(), getColour());
	}

}
