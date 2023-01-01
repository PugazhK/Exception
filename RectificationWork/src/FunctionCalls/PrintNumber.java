package FunctionCalls;

public class PrintNumber {
	public void show(int a , int b) {
		System.out.println(a +" "+ b);
	}
	public void displayTotal(int a, int b) {
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) {
		PrintNumber pn = new PrintNumber();
		pn.show(8, 2);
		pn.displayTotal(8, 2);
	}
}
