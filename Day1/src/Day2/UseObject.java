package Day2;

public class UseObject {
	public static void main(String [] args) {
		Object c1 = new Object();
		c1.brand = "bmw";
		c1.color = "black";
		c1.numberPlate = "TN 06 AW 5676";
		c1.price = 5000000;
		c1.rating = 4.5f ;
		
		Object c2 = new Object();
		c2.brand = "suzuki";
		c2.color = "yellow";
		c2.numberPlate = "tn 06 sw 5476";
		c2.price = 500000;
		c2.rating = 3.5f ;
		
		System.out.println(c1.brand.toUpperCase());
		System.out.println(c2.brand.toUpperCase());
		System.out.println(c2.numberPlate.toUpperCase());
		
	}
}
