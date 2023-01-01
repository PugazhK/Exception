package For4;

public class MinimumNumberFinding {
	public static void main (String [] args) {
		int [] num = {2,5,7,60,75,33,27};
		int min = num[0];
		for (int i=0 ; i<num.length; i++) {
			if (min>num[i]) {
				min = num[i];
			}
			else {
			}
		}
		System.out.println(min);
	}
	
}
