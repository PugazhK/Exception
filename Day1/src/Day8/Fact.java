package Day8;

public class Fact {
	public static void main (String [] args) {
		int factor = 1;
		for (int i=5; i>=1; i--) {
			factor=factor*i;
		}
		System.out.println(factor);
	}
}
