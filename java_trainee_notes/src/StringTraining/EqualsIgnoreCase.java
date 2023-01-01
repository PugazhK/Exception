package StringTraining;

public class EqualsIgnoreCase {
	public static void main (String [] args) {
		String a = "FUTURE IS YOURS";
		String b = "future is YOURS";
		String c = "Future is yours";
		boolean d = a.equalsIgnoreCase(b);
		System.out.println(d);
	}
}
