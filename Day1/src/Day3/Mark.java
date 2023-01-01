package Day3;

public class Mark {
	public static void main(String[]args) {
		int mark = -105;
		if (mark >=90 && mark <=100) {
			System.out.println("YOUR GRADE IS '0'");
		}
		else if (mark >=75 && mark <90) {
			System.out.println("YOUR GRADE IS 'A'");
		}
		else if (mark >=50 && mark <75) {
			System.out.println("YOUR GRADE IS 'B'");
		}
		else if (mark >=0 && mark <50) {
			System.out.println("YOUR GRADE IS 'FAIL'");
		}
		else {
			System.out.println("INVALID");
		}
	}
}
