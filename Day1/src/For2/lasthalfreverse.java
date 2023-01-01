package For2;

public class lasthalfreverse {
	public static void main (String [] args) {
		int a[] = {10,20,30,40,50};
		int total =0;
		for (int i=a.length-1 ; i>=(a.length-1)/2; i--) {
			System.out.println(a[i]);
			total = total + a[i];
		}
		System.out.println(total);
	}
}
