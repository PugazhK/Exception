package OOPSwithAggregation;

public class Engine {
	private String brand;
	private int price;
	private int model;
	
	public Engine(String brand, int price, int model) {
		this.brand = brand;
		this.price = price;
		this.model = model;
	}
	
	public String toString () {
		return "The Engine Brand is "+brand+", The Engine price is "+price+", The Engine model is "+model;
	}
}
