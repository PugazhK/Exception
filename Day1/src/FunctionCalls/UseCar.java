package FunctionCalls;

public class UseCar {
	public static void main (String [] args) {
		Car c1 = new Car();
		c1.price = 700000;
		c1.brand = "Hyundai";
		c1.color = "Red";
		
		Car c2 = new Car();
		c2.price = 1400000;
		c2.brand = "Toyoto";
		c2.color = "White";
		
		Car c3 = new Car();
		c3.price = 600000;
		c3.brand = "Suzuki";
		c3.brand = "Blue";
		
		System.out.println(c1.findMaxBrand(c2,c3));
	}
}
