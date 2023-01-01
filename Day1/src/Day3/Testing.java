package Day3;

public class Testing {
	public static void main(String[]args) {
		
		int num1 = 300;
		int num2 = 30;
		int num3 = 3;
		
		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is smaller");
		}
		else if (num2 < num1 && num2 < num3) {
			System.out.println(num2 + " is smaller");
		}
		else {
			System.out.println(num3 + " is smaller");
		}
	}
}
