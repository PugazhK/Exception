package FunctionCallsTraining;

public class Check {
	public String findPrime(int a) {
		boolean flag = true;
		for (int i=2; i<a; i++) {
			if (a%i==0) {
				 flag = false;
			}
		}
		if(flag) {
			return a +" is a prime";
		}
		else {
			return a +" is not a prime";
		}
	}
}
