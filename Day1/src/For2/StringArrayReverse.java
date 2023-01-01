package For2;

public class StringArrayReverse {
	public static void main (String [] args) {
		String word[] = {"hi","hello","how"};
		for (int i=word.length-1; i>=0 ; i--) {
			System.out.println(word[i]);
		}
	}
}
