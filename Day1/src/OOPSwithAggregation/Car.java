package OOPSwithAggregation;

import java.util.Arrays;

public class Car {
	private String brand;
	private int price;
	private String color;
	private Engine engine;
	private Tyre [] tyres;
	
	public Car(String brand, int price, String color, Engine engine, Tyre[] tyres) {
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.engine = engine;
		this.tyres = tyres;
	}
	public String toString() {
		return "The Car Brand is "+brand+", The Car Price is "+price+", The Car Color is "+color+
				", The Car Engine is "+engine+", The Car tyre is \n"+Arrays.toString(tyres) ;
	}
}
