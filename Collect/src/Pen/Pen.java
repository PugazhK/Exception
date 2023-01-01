package Pen;

public class Pen {
		private String brand;
		private int price;
		private String color;
		
		public void setBrand() {
			this.brand = brand;
		}
		public String getBrand() {
			return this.brand;
		}
		
		public void setPrice() {
			this.price = price;
		}
		public int getPrice() {
			return this.price;
		}
		
		public void setColor() {
			this.color = color;
		}
		public String getColor() {
			return this.color;
		}
		
		public Pen(String brand, int price, String color) {
			this.brand=brand;
			this.price=price;
			this.color=color;
		}
		
		public String toString() {
			return brand +" "+ price +" "+ color;
		}	
}
