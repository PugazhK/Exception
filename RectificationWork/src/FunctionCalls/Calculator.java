package FunctionCalls;

public class Calculator {
	public void findAddition(int a, int b) {
		System.out.println(a+b);
	}
	public void findSubstraction(int a, int b) {
		System.out.println(a-b);
	}
	public void findMultiplication(int a, int b) {
		System.out.println(a*b);
	}
	public void findDivision(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator calcy = new Calculator();
		calcy.findAddition(5, 2);
		calcy.findDivision(5,2);
		calcy.findMultiplication(5, 2);
		calcy.findSubstraction(5, 2);
	}
}
