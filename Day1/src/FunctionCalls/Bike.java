package FunctionCalls;

public class Bike {
	int price;
	String model;
	String brand;
	int no;
	
	
	
	public void output () {
		System.out.println(price + "\n" + model + "\n" + brand + "\n" + no);
	}
	
	public String name() {
		if(brand.length()>4) {
			return brand.toUpperCase();
		}
		else {
			return brand;
		}
	}
	
	public int highcost (Bike[]  h) { 

//		if(h[0].price > h[1].price && h[0].price > h[2].price) {
//			return h[0].price;
//		}
//		else if (h[1].price > h[0].price && h[1].price > h[2].price) {
//			return h[1].price;
//		}
//		else {
//			return h[2].price;
//		}
		int hc = h[0].price;
		for (int i=0; i<h.length; i++) {
			if (hc<h[i].price) {
				hc=h[i].price;
			}
		}
		return hc;
	}
	
	public  String getCost (Bike [] h) {
		int max =0;
		String name = "";
		for (int i=1; i<h.length; i++) {
			if (max<h[i].price) {
				max = h[i].price;
				name = h[i].brand;
			}
		}
		return name+" this is high price";
		
	}
	public String findingPrime (Bike [] h) {
		boolean flag = true;
		for (int i=2; i<no; i++) {
			if (no%i==0) {
				flag= false;
			}
		}
		if (flag) {
			return "it is prime";
		}
		else {
			return "it is not a prime";
		}
	}
}
