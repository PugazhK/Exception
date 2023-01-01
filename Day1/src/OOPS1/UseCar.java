package OOPS1;

public class UseCar {
	public static void main (String [] args) {
		
		Engine e = new Engine();
		e.brand = "Ford";
		e.price = 12000;
		e.model = 125;
		
		Car c = new Car();
		c.brand = "Hyundai";
		c.price = 1250000;
		c.color = "red";
		c.engine = e;
		
//		System.out.println("The Car brand is "+c.brand);
//		System.out.println("The car price is "+c.price);
//		System.out.println("The car color is "+c.color);
//		
//		System.out.println("The Engine brand is "+c.engine.brand);
//		System.out.println("The Engine price is "+c.engine.price);
//		System.out.println("The Engine model is "+c.engine.model);
		
		System.out.println(c.carDetails());
		
	}	
}
