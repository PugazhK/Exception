package OOPSwithAggregation;

public class Tyre {
	private String brand;
	private int price;
	
	public Tyre(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return "The tyre Brand is "+brand+ ", The tyre Price is "+price;
	}
	public Tyre highCost(Tyre [] t) {
		int max =0;
		Tyre maxObject =null;
		for (int i=0; i<t.length; i++) {
			if(max<t[i].price) {
				max = t[i].price;
				maxObject = t[i];
			}
		}
		return maxObject;
	}
}
