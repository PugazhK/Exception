package CustomExcep;

public class check {
	public static void main(String[] args) {
		
		
		
		int a= 10;
		int b = 0;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Run the next code");
		}
		
		
		
	}
}
