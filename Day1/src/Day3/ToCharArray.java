package Day3;

public class ToCharArray {
	public static void main(String [] args) {
		String a = "Pugazhendhi";
		char [] b = a.toCharArray();
		int in = a.indexOf('z');
		System.out.println(in);
		System.out.println(b[0]+" "+b[1]+" "+b[2]);
	}
}
