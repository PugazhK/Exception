package Day2;

public class StringMethods {
	public static void main(String [] args) {
		String word = "Python";
		System.out.println("The index of h : " + word.indexOf("h"));
		System.out.println("The length of the given word : " + word.length());
		System.out.println("Is the word starts with Py : " + word.startsWith("Py"));
		System.out.println("Is the word ends with on: " + word.endsWith("on"));
		System.out.println("Equals : "+word.equals("Python"));
		System.out.println("Equals Ignore : "+ word.equalsIgnoreCase("python"));
		System.out.println("Contains : " + word.contains("w"));
		System.out.println("Char At : " + word.charAt(4));
		System.out.println("Concatination : " + word.concat(" world"));
		System.out.println("Upper Case : " + word.toUpperCase());
		System.out.println("Lower Case : " + word.toLowerCase());
		System.out.println("Sub String : " + word.substring(0,4));
		
		char[] a = word.toCharArray();
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
		
		String caps = word.toUpperCase();
		System.out.println(caps);
	
	}
}
