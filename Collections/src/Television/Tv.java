package Television;

public class Tv {
	String brand;
	int inch;
	int price;
	String display;
	
	public Tv(String brand, int inch, int price, String display) {
		this.brand=brand;
		this.inch=inch;
		this.price=price;
	}
	
	public String toString () {
		return "Brand "+brand+", Inches "+inch+", Price "+price+", Display "+display;
	}
}
