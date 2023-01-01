package OOPSnext1;

public class Car {
	private String brand;
	private int price;
	private String color;
	private Engine engine;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return this.price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return this.engine;
	}
	
	public Car (String brand, int price, String color, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.engine = engine;
	}
//	public String toString() {
//		return "Brand = " + brand + ", Price = " + price + ", Color = " +color+ ", Engine = " +engine;
//	}
}
