package FunctionCalls;

public class Bike {
	String brand;
	int speed;
	int price;
	int tax;
	int netPrice;
	
	public int totalPrice(Bike a[]) {
		int totalPrice=0;
		for(int i=0; i<a.length; i++) {
			totalPrice = totalPrice + a[i].netPrice;
		}
		return totalPrice;
	}
	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.brand = "Pulsar";
		b1.speed = 220;
		b1.price = 150000;
		b1.tax = 20000;
		b1.netPrice = b1.price + b1.tax;
		
		Bike b2 = new Bike();
		b2.brand = "Fazer";
		b2.speed = 180;
		b2.price = 120000;
		b2.tax = 15000;
		b2.netPrice = b2.price + b2.tax;
		
		Bike b3 = new Bike();
		b3.brand = "Duke";
		b3.speed = 250;
		b3.price = 220000;
		b3.tax = 30000;
		b3.netPrice = b3.price + b3.tax;
		
		Bike [] bike = {b1,b2,b3};
		System.out.println(b1.totalPrice(bike));
	}
}
