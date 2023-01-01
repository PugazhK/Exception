package FunctionCallsTraining;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop lap1 = new Laptop();
		lap1.brand="Innova";
		lap1.price=30000;
		lap1.color="black";
		
		Laptop lap2 = new Laptop();
		lap2.brand="HP";
		lap2.price=40000;
		lap2.color="Ash-Grey";
		
		Laptop lap3 = new Laptop();
		lap3.brand="Innova";
		lap3.price=30000;
		lap3.color="black";
		
		Laptop [] lap = {lap1, lap2, lap3};
		
		System.out.println(lap3.detailsOfLaptop(lap));
	}
}
