package OOPSwithAggregation;

public class UseCar {
	public static void main (String [] args) {
		
		Tyre t1 = new Tyre("MRF",2000);
		Tyre t2 = new Tyre("TVS",1300);
		Tyre t3 = new Tyre("XYLO",1600);
		Tyre t4 = new Tyre("CEAT",1800);
		
		Tyre[] tyres = {t1,t2,t3,t4};
		
		Engine e = new Engine("Ford",7000,564);
		Car c = new Car("Toyoto",1600000,"Black",e,tyres);
		
		System.out.println(c);
		System.out.println(t1.highCost(tyres));
	}
}
