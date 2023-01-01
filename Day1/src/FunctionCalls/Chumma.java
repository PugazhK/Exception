package FunctionCalls;

public class Chumma {
	public static void main(String[] args) {
		String a = "BhaVAni16@Gmail.com";
		char [] b = a.toCharArray();
		int countOfCapitalsLetter = 0;
		for (int i=0; i<b.length; i++) {
			if(b[i]>='A'&&b[i]<='Z') {
				countOfCapitalsLetter = countOfCapitalsLetter+1;
			}
		}
		System.out.println("countOfCapitalsLetter = "+countOfCapitalsLetter);
		
		int countOfLowerCase = 0;
		for (int i=0; i<b.length; i++) {
			if(b[i]>='a'&&b[i]<='z') {
				countOfLowerCase = countOfLowerCase+1;
			}	
		}
		System.out.println("countOfLowerCase = "+countOfLowerCase);
		
		int countOfNumbers = 0;
		for (int i=0; i<b.length; i++) {
			if(b[i]>=0&&b[i]<=9) {
				countOfNumbers = countOfNumbers+1;
			}	
		}
		System.out.println("countOfNumbers = "+countOfNumbers);
}
}
