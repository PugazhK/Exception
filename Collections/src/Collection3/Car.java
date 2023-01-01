package Collection3;

public class Car {
	private String brand;
	private int price;
	private String color;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice (int price) {
		this.price = price;
	}
	public void setColor (String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return this.brand;
	}
	public int getPrice() {
		return this.price;
	}
	public String getColor() {
		return this.color;
	}
	
	public Car (String brand, int price, String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
}
