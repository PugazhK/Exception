package For4;

public class Ex1 {
	public static void main (String [] args) {
		String [] name = {"java", "python", "c++", "html", "angular"};
		for (int i=0 ; i<name.length; i++) {
			System.out.println(name[i].charAt(name[i].length()-1));
		}
	}
}
