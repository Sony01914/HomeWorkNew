package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public Boolean madeinUSA;
	public String configuration;

	public Computer() {
		System.out.println(" This is from default Constructor of Computer class.");

	}

	public Computer(String sony) {
		this.configuration = sony;
		System.out.println("configuration " + sony);

	}

	public Computer(String brand, String model, String operatingSystem, int price, char grade, Boolean madeinUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.grade = grade;
		this.madeinUSA = madeinUSA;
		System.out.println(" My Brand: " + brand + ", Model: " + model + ", Operating system: " + operatingSystem + ", Price "
				+ price + ", Grade " + grade + ", Made in USA?" + madeinUSA);
	}

}
