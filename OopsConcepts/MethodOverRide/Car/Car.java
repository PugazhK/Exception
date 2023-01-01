package Car;

public class Car {
	private String brand;
	private int price;
	
	public int showSpeed(int cc) {
		return 200;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(String brand) {
		this.brand = brand;
	}
	public String getPrice() {
		return brand;
	}
	
	public Car(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return "Brand = " + brand + " Price = " + price;
	}
	
}
