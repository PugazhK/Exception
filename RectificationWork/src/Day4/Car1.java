package Day4;

public class Car1 {
	
	public static void main(String[] args) {
		String a[] = args[0].split(",");
		Car1 car = new Car1();
		car.brand = a[0];
		car.color = a[1];
		car.price = Integer.parseInt(a[2]);
		
		System.out.println(car.brand);
		System.out.println(car.color);
		System.out.println(car.price);
	}
	
	String brand;
	String color;
	int price;
}
