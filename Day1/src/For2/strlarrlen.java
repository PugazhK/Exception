package For2;


public class strlarrlen {
	public static void main (String [] args) {
		String word[] = {"Hii","Hello","How"};
		String let = " ";
		int len = 0;
		for (int i=0 ; i<word.length; i++) {
			let = word[i];
			len = word[i].length();
		System.out.println("The word is "+word[i]+" and length is "+word[i].length()+".");	

		System.out.println(let);
		System.out.println(len);
		}
}
}
