package FunctionCalls;

public class Car {
	int price;
	String brand;
	String color;
	
	public String findMaxBrand(Car c, Car c1) {
		if (price > c.price && price > c1.price) {
			return brand;
		}
		else if (c.price > price && c.price > c1.price) {
			return c.brand;
		}
		else {
			return c1.brand;
		}
	}
}
