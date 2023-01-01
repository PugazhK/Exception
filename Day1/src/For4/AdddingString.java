package For4;

public class AdddingString {
	public static void main (String [] args) {
		String [] name = {"java", "python", "c++", "html", "angular"};
		String a1 = "";
		for (int i=name.length-1 ; i>=0; i--) {
			a1 = a1.concat(name[i]);
		}
		System.out.println(a1);
	}
}
