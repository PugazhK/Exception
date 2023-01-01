package For2;

public class StringArraySkipping {
	public static void main (String [] args) {
		String word[] = {"hi","hello","how"};
		for (int i=0; i<word.length; i=i+2) {
			System.out.println("this is index of 0 and 2 " +word[i]);
		}
		for (int y=1; y<word.length; y=y+2) {
			System.out.println("this is index of 1 " +word[y]);
		}
		
	}
}
