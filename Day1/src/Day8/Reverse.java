package Day8;

public class Reverse {
	public static void main (String [] args) {
		String name = "PUGAZH";
		for (int i=name.length()-1; i>=0; i--) {
			System.out.println(name.charAt(i));
		}
	}
}