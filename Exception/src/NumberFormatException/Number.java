package NumberFormatException;

public class Number {
	public static void main(String[] args) {
		String a ="Hello";
		int b = 0;
		try {
			b = Integer.parseInt(a);
		} catch  (NumberFormatException  ne) {
			System.out.println("please pass numbers only");
		}
		System.out.println(b);
	}
}
