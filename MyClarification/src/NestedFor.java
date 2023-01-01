
public class NestedFor {
	public static void main(String[] args) {
		int num = 27;
		if (num%2==0) {
			if(num%4==0) {
				System.out.println("it is even and divisible by 4");
			}
			else {
				System.out.println("it is even but not divisible by 4");
			}
		} else {
			if(num%9==0) {
				System.out.println("it is odd and divisible by 9");
			}else {
				System.out.println("it is odd but not divisible by 9");
			}
		}
	}
}
