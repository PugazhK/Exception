package NullPointerException;

public class Null {
	public static void main(String[] args) {
		String a = null;
		System.out.println(a.length());
		int b = 0;
		try {
		   b = a.length();
		} catch (NullPointerException npe) {
			System.out.println("you can't able to find lenght of the null values");
		}
		System.out.println(b);
	}
}
