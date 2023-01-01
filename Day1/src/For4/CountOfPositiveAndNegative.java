package For4;

public class CountOfPositiveAndNegative {
		public static void main (String [] args) {
			int [] num = {-10,15,17,18,19,-1,-5,60,75,66,-56};
			
			int positiveCount =0;
			int negativeCount =0;
			for  (int i=0; i<num.length; i++) {
				
				if (num[i]>=0) {
					positiveCount = positiveCount + 1;
				}
				else {
					negativeCount = negativeCount + 1;
				}
			}
			System.out.println(positiveCount);
			System.out.println(negativeCount);
			
		}
}
