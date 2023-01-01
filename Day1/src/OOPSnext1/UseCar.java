package OOPSnext1;

public class UseCar {
	public static void main(String[] args) {
//		Engine e = new Engine();
//		e.setBrand("Ford");
//		e.setPrice(10000);
//		e.setModel(564);
//
//		Car c = new Car();
//		c.setBrand("Hyundai");
//		c.setPrice(1500000);
//		c.setColor("Blue");
//		c.setEngine(e);
		
		
//		System.out.println("------------------");
//		System.out.println("   CAR DETAILS");
//		System.out.println("------------------");
//		System.out.println(c.getBrand());
//		System.out.println(c.getPrice());
//		System.out.println(c.getColor());
//		System.out.println("------------------");
//		System.out.println("  ENGINE DETAILS");
//		System.out.println("------------------");
//		System.out.println(c.getEngine().getBrand());
//		System.out.println(c.getEngine().getPrice());
//		System.out.println(c.getEngine().getModel());
//		
		Engine e = new Engine("Ford", 125000, 125);
		Car c = new Car ("Hyundai", 1500000, "Blue", e);
		
		System.out.println(c);
	}
}
