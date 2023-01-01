package ArithmaticExp;

public class NumberByZero {
	public static void main(String[] args) {
		int a = 16;
		int b = 0;
		int add = a+b;
		int sub = a-b;
		System.out.println(add);
		System.out.println(sub);
		int div=0;
		try {
			div = a/b;
		}
		catch (Exception e) {
			System.out.println("Never divide a number by zero");
		}
		
		int mul = a*b;
		
		
		System.out.println(div);
		System.out.println(mul);
	}
}
