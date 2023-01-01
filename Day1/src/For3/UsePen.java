package For3;

public class UsePen {
	public static void main (String [] args) {
		Pen pen1 = new Pen();
		pen1.brand = "cello";
		pen1.price = 5;
		pen1.color = "blue";
		
		Pen pen2 = new Pen();
		pen2.brand = "Montex";
		pen2.price = 20;
		pen2.color = "black";
		
		Pen pen3 = new Pen();
		pen3.brand = "Reynolds";
		pen3.price = 10;
		pen3.color = "Red";
		
		Pen pen[] = {pen1,pen2,pen3};
//		Pen pen[] = new Pen [3];
//		pen[0]=pen1;
//		pen[1]=pen2;
//		pen[2]=pen3;
		
		
		for (int i=0; i<pen.length; i++) {
			System.out.println("Brand is "+pen[i].brand+" ,The price is " + pen[i].price+ " ,the color is " + pen[i].color);
		}
		int totalPrice = 0;
		for (int i=0; i<pen.length; i++) {
			totalPrice = totalPrice + pen[i].price;
		}
		System.out.println("Total price is "+totalPrice);
		String totalBrand = "";
		for (int i=0; i<pen.length; i++) {
			totalBrand = totalBrand.concat(pen[i].brand);
		}
		System.out.println(totalBrand);
		int totalLength = 0; 
		for (int i=0; i<pen.length; i++) {
			totalLength = totalLength + pen[i].brand.length();
		}
		System.out.println(totalLength);
		char a;
		for (int i=0; i<pen.length; i++) {
			a = pen[i].brand.charAt(pen[i].brand.length()-2);
			System.out.println(a);
		}
		int details = 0;
		for (int i=0; i<pen.length; i++) {	
		}
	}
}
