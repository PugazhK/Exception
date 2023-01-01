package FunctionCalls;

public class OddEven {
	public void findOddEven(int a) {
		if (a%2==0) {
			System.out.println(a +" is even");
		}
		else {
			System.out.println(a +" is odd");
		}
	}
	
	public static void main(String[] args) {
		OddEven oddOrEven = new OddEven();
		oddOrEven.findOddEven(5);
	}
}
