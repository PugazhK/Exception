package Bike;

public class Bike {
	private String brand;
	private int price;
	private int model;
	
	public int findNetPrice(int taxPercentage) {
		return taxPercentage;	
	}
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return this.brand;
	}
	
	
	public void setPrice (int price) {
		this.price = price;
	}
	public int getPrice () {
		return this.price;
	}
	
	
	public void setModel () {
		this.model = model;
	}
	public int getModel () {
		return model;
	}
	
	
	public Bike (String brand, int price, int model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
		
	}
	
	public String toString() {
		return "Brand = " +this.brand+ "Price = " + this.price + " Model = " + this.model;
	}
	
	
}
