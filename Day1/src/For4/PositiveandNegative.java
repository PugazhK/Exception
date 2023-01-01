package For4;

public class PositiveandNegative {
	public static void main (String [] args) {
		int [] num = {-10,15,17,18,19,-1,-5,60,75,66,-56};
		for  (int i=0; i<num.length; i++) {
			if (num[i]>0) {
				System.out.println(num[i] + " is Positive");
			}
			else {
				System.out.println(num[i] + " is Negative");
			}
		}
	}
}
