package Day3;

public class Check {
	public static void main (String[] args) {
		String b = "APPLE";
		if (b.endsWith("a") || b.endsWith("A")) {
			System.out.println("the given word ends with vowel");
		}
		else if (b.endsWith("e")|| b.endsWith("E")) {
			System.out.println("the given word ends with vowel");
		}
		else if (b.endsWith("i") || b.endsWith("I")) {
			System.out.println("the given word ends with vowel");
		}
		else if (b.endsWith("o") || b.endsWith("O")) {
			System.out.println("the given word ends with vowel");
		}
		else if (b.endsWith("e") || b.endsWith("U")) {
			System.out.println("the given word ends with vowel");
		}
		else {
			System.out.println("the given word does not ends with vowel");
		}
	}
}
