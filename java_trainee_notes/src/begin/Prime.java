package begin;

public class Prime {
	public static void main(String[] args) {
		int num  = 9;
		boolean flag  = true;
		for(int i = 2;i<num;i++) {
			
			if(num%i==0) {
				flag = false;
			}
			
		}
		if(flag) {
			System.out.println(num + " is a prime");
		}
		else {
			System.out.println(num + " is not a prime");
		}
	}

}
