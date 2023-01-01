package For4;

public class VowelFindingString {
	public static void main (String [] args) {
		String name = "onesoft";
		char a[] = name.toCharArray();
		for (int i=0; i<a.length ; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {
				System.out.println(a[i] + " is vowel");
			}
			else {
				System.out.println(a[i] + " is not vowel");
			}
		}
	}
}
