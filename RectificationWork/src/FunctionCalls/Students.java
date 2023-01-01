package FunctionCalls;

public class Students {
	public void printMarks(int maths, int english, int biology) {
		System.out.println("maths mark is "+maths+"english mark is "+english+" biology mark is "+biology);
	}
	
	public static void main(String[] args) {
		Students std = new Students();
		std.printMarks(0, 0, 0);
	}
}
