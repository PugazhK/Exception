package OOPSbike;

public class UseBike {
	public static void main (String [] args) {
		Engine e = new Engine("bajaj",6000,220);
		Bike b = new Bike("pulsar",66000,"blue",e);
		Bike b1 = new Bike ("fazer",70000,"Red",e);
		Bike b2 = new Bike ("Duke",100000, "white-0range",e);
		
		Bike [] bi = {b,b1,b2};
		
		System.out.println(b);
		System.out.println(b.maxObject(bi));
	}
}
