package FOR4;


public class Prime {
	public static void main(String[] args) {
		//ArrayList<Integer> prime num = 
		for(int i = 1; i<=10; i++) {
		int num = i;
		boolean flag = true;
			for(int j=2; j<num; j++) {
			if (num%2==0) {
				flag = false;
			}
			else {
				flag = true;
			}
		}
		if(flag) {
			System.out.println(num + " is prime");
		}
		else {
			//System.out.println(num + " it is not a prime");
		}
		}
	}
}
