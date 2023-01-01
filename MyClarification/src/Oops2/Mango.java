package Oops2;

public class Mango extends Fruit{
	String name;
	String color;
	int quantity;
	
	public Mango (String name, String color, int quantity){
		this.name = name;
		this.color = color;
		this.quantity = quantity;
	}
	
	public String toString() {
		return name + " " + color + " " + quantity;
	}
	
	public static void main(String [] args) {
		Fruit mango = new Mango("Mango", "Yellow", 5);
		Fruit jack = new Mango("Jack Fruit", "Yellow", 10);
		System.out.println(mango);
	}
}
