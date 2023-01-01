package OOPS1;

public class Car {
	String brand;
	int price;
	String color;
	Engine engine;
	
	public String carDetails() {
		return brand + "\n" +price + "\n" +color + "\n" + engine.engineDetails() ;
	}
}
