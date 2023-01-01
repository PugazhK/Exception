package Bike;

public class Bike {
	private String brand;
	private int price;
	private String vehicleNumber;
	private String color;
	
	public void setBrand() {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice() {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setVehicleNumber() {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public void setColor() {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public Bike (String brand, int price, String vehicleNumber, String color) {
		this.brand = brand;
		this.price = price;
		this.vehicleNumber = vehicleNumber;
		this.color = color;
	}
	
	public String toString() {
		return brand +" "+ price +" "+ vehicleNumber +" "+ color;
	}
}
