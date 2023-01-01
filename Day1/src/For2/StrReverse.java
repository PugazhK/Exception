package For2;

public class StrReverse {
	public static void main (String [] args) {
		String a = "mango apple blueberry banana";
		String b[] = a.split(" ");
		for (int i=b.length-1; i>=0; i--) {
			System.out.println(b[i]);
		}
		
	}
}
