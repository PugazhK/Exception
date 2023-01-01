package OOPSbike;

public class Bike {
	private String brand;
	private int price;
	private String color;
	private Engine engine;
	
	public Bike(String brand, int price, String color, Engine engine) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.engine = engine;
	}
	public String toString() {
		return "Brand = "+brand+", Price = "+price+", color = "+color+", Engine = "+engine;
	}
	
	public Bike maxObject(Bike [] h) {
		Bike store = null;
		int max = 0;
		for (int i=0; i<h.length; i++) {
			if(max<h[i].price) {
				max = h[i].price;
				store = h[i];
			}
		}
		return store;
	}
}
