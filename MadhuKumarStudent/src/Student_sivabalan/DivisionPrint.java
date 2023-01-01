package Student_sivabalan;

public class DivisionPrint {
	

	
	public static void main(String[] args) {
		
		int divident = 2567;
		int divisor = 2;
		
		String dividentString = divident+"";
		String divisorString = divisor+"";
		
		System.out.println(divisorString +")"+dividentString);
		
		printSpace(divisorString.length()+1);
		
		printStar(dividentString.length());
		
		int itr = dividentString.length()/divisorString.length();
		
		int indexPos = 0;
		int d = 0;
		
		for (int i=0; i<itr; i++) {
			int a = Integer.parseInt(divisorString.substring(indexPos,indexPos+divisorString.length()));
			int b = a/divisor;
			int c = b*divisor;
			if(d==0) {
				printSpace(divisorString.length()+1+indexPos);
				System.out.println(a);
				printSpace(divisorString.length()+1+indexPos);
			}
			else {
				printSpace(divisorString.length()+indexPos);
				String s = d +""+c;
				System.out.println(s);
				c = Integer.parseInt(s);
				printSpace(divisorString.length()+indexPos);
			}
			System.out.println(c);
			printSpace(divisorString.length()+1);
			printStar(dividentString.length());
			indexPos+=divisorString.length();
			c = b*divisor;
			d = a-c;
		}
		

		System.out.println(divident/divisor);
		System.out.println(divident%divisor);
	}
	
	
	private static void printSpace(int i) {
		for(int j=0; j<i; j++) {
			System.out.println(" ");
		}
	}
	
	private static void printStar(int length) {
		for (int i=0; i<length; i++) {
			System.out.println("*");
		}
		System.out.println();
		
	}
}
