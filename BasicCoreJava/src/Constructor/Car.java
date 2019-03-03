package Constructor;

public class Car {
	String name;
	int speed;
	String manufactures; // 4, 5,6,7 are instance variable
	static int wheels = 4; // since wheel is common in car class that's why we
							// have define this variable as static

	/*
	 * public Car() { // this is default constructor, we can use access modifier while defining a constructor. this control the data }
	 */

	public Car(String name, int speed, String manufactures) {
		this.name = name;
		this.speed = speed;
		this.manufactures = manufactures; // this keyword is used to point to
											// instance variable
	}

	public Car() {
		// constructor overloading
	}

	public void drive() {
		System.out.println("Drive hundai verna car at the speed of 90");

		System.out.println("Drive" + manufactures + name + speed); // Concatenation
	}

	public void acclerate() {
		System.out.println("Acclerate hundai verna with 4 wheels");

		System.out.println("Acclerate" + manufactures + name + wheels);
	}
}