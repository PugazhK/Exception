package For2;

public class WordAndFirstLetter {
	public static void main (String [] args) {
		String a[] = {"Laptop","Computer","Mobile","I-pad"};
		for (int i=0 ; i<a.length ; i++) {
			System.out.println("The word is "+a[i]+" and First letter is "+a[i].charAt(0)+".");
			System.out.println("The word is "+a[i]+" and last letter is "+a[i].charAt(a[i].length()-1)+".");
		}
	}
}
