package FunctionCalls;

public class UseBike {
	public static void main (String [] args) {
		Bike b1= new Bike ();
		b1.price = 1200000;
		b1.model = "pulser";
		b1.brand = "bajaj";
		b1.no = 5647;
		
		Bike b2= new Bike ();
		b2.price = 120000;
		b2.model = "fazer";
		b2.brand = "yamaha";
		b2.no = 4764;
		
		Bike b3= new Bike ();
		b3.price = 62000;
		b3.model = "pept";
		b3.brand = "tvs";
		b3.no = 8674;
		
		Bike bike[] = {b1,b2,b3};
		
		b1.output();
		b2.output();
		b3.output();
		
		System.out.println(b1.name());
		System.out.println(b1.highcost(bike));
		System.out.println(b1.getCost(bike));
		System.out.println(b1.findingPrime(bike));
		
	}
}
