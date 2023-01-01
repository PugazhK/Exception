package OOPSnext1;

public class Engine {
	private String brand;
	private int price;
	private int model;

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

	public void setModel(int model) {
		this.model = model;
	}

	public int getModel() {
		return this.model;
	}
	
	public Engine (String brand, int price, int model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
//	public String toString() {
//		return "Brand = "+brand+", Pricd = "+price+", model = "+model;
//	}
}

