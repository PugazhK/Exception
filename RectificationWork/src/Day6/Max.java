package Day6;

public class Max {
	public static void main(String[] args) {
		int a = 3, b=8, c = 5, d = 1;
		
		if(a%2!=0) {
			if(a>b && a>c && a>d) {
				System.out.println(a);
			}
			else if(b%2!=0) {
				if(b>a && b>c && b>d) {
					System.out.println(b);
				}
				else {
					System.out.println("no idea");
				}
			}
			else if (c%2!=0) {
				if(c>a && c>b &&c>d) {
					System.out.println(c);
				}
//				else {
//					System.out.println("no idea");
//				}
			}
			else if (d%2!=0) {
				if(d>a && d>b && d>c) {
					System.out.println(d);
				}
//				else {
//					System.out.println("no idea");
//				}
			}
			else {
				System.out.println("no idea");
			}
		}
		else if(b%2!=0) {
			if(b>a && b>c && b>d) {
				System.out.println(b);
			}
		}
		else if (c%2!=0) {
			if(c>a && c>b &&c>d) {
				System.out.println(c);
			}
		}
		else if (d%2!=0) {
			if(d>a && d>b && d>c) {
				System.out.println(d);
			}
		}
		else {
			System.out.println("no idea");
		}
	}
}
