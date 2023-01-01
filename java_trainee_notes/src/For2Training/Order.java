package For2Training;

public class Order {
	public static void main (String [] args) {
		int a[] = {10,20,30,40,50};
		int total = 0 ;
		for (int i=0; i<a.length; i++) {
			total = total+a[i];
		}
		System.out.println(total);
	}
}
