package For2Training;

public class PrimeArray {
	public static void main (String [] args) {
		int a[] = {2,789,564,73,57,7};
		
		for (int i=0; i<a.length; i++) {
			boolean flag = true;
			for (int j=2; j<a[i]; j++) {
				if (a[i]%j==0) {
						flag =false;
						
				}
			}
			if (flag) {
				System.out.println(a[i] + " is a prime");
			}
			else {
				System.out.println(a[i] + " is not a prime");
			}
		}
	}
}
