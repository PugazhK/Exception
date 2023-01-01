package For2Training;

public class Prime {
	public static void main (String [] args) {
		int num  = 100;
		for (int i = 1; i <= num; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					flag = false;
				}	
			}
			if(flag) {
				System.out.println(i+" prime");
			}
			else {
				System.out.println(i+" not a prime");
			}
			
		}
	
	}
}
