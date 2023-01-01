package For4;

public class Palandrom {
	public static void main (String [] args) {
		String name = "madam";
		String rev ="";
		for (int i=name.length()-1; i>=0; i--) {
			rev = rev+name.charAt(i);
		}
		if(rev.equals(name)) {
			System.out.println("IT IS PALANDROM");
		}
		else {
			System.out.println("Not a palandrom");
		}
	}
}
