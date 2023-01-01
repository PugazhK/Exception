package For4;

public class AddorEven {
	public static void main (String [] args) {
		int a[] = {12,15,16,21,54};
		for (int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("the given number "+a[i]+" is EVEN");
			}
			else {
				System.out.println("the given number "+a[i]+" is ODD");
			}
		}
	}
}
