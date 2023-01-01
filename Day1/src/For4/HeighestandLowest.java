package For4;

public class HeighestandLowest {
	public static void main (String [] args) {
		int [] num = {-10,15,17,18,19,-1,-5,60,75,66,-56};
		int heighestNumber = 0;
		int lowestNumber = 0;
		for (int i=0; i<num.length; i++) {
			if (heighestNumber < num[i]) {
				heighestNumber = num[i];
			}
			else {
				lowestNumber = num[i];
			}
		}
		System.out.println(heighestNumber);
		System.out.println(lowestNumber);
	}
}
