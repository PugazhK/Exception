package Day4;

public class useLmsBook {
	public static void main(String [] args) {
		
		String [] a = args[0].split(" ");
		
		LmsBook b1 = new LmsBook();
		b1.name =a[0];
		b1.noOfPages = Integer.parseInt(a[1]);
		b1.price = Float.parseFloat(a[2]);
		b1.isFiction = Boolean.parseBoolean(a[3]);
		b1.publicationLogo = (a[4].charAt(0));
		b1.discount =Float.parseFloat(a[5]);
		b1.tax = Float.parseFloat(a[6]);
		
		float priceWithTax = b1.price +( b1.price*(b1.tax/100));
		float priceWithDiscount = priceWithTax - b1.discount;
		
		System.out.println("Name = " + b1.name + " Number of Pages = " + b1.noOfPages + " Price of the Book = " + b1.price +
				           " Is this Book Fiction = " + b1.isFiction + " Publication Logo = " + b1.publicationLogo + 
				           " Discount = " + b1.discount + " Tax = " +b1.tax + " Price With Tax = " + priceWithTax + 
				           " Price With Discount = " + priceWithDiscount);
		System.out.println(priceWithTax);
		System.out.println("\"hello world\"");
	}
}
