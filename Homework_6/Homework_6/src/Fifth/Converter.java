package Fifth;

import java.util.Scanner;


public class Converter {
	private double celsius;
	
	
	
	public Converter() {
		setCelsius(0.0);
		}

	public Converter(double celsius) {
		setCelsius(celsius);
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}

	public static double CelsiusToFahrenheit(double temp) {
		double tempF = (temp * 9) / 5 + 32;
		return tempF;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");

		double temperature = input.nextDouble();
		temperature = CelsiusToFahrenheit(temperature);
		System.out.println("The temperature in Fahrenheit is:" + temperature);
		input.close();
	}

}