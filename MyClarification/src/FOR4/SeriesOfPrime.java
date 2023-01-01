package FOR4;

public class SeriesOfPrime {
	public static void main(String[] args) {
		
		  int num = 10;
		  boolean flag = true;

		  for (int i = 1; i <= num; i++) {
		   flag = true;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     flag = false;
		     break;
		    }
		   }

		   if (flag) {
		    System.out.println(i);
		   }

		  }
	}
}
