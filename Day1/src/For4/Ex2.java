package For4;

public class Ex2 {
		public static void main (String [] args) {
			String [] name = {"java", "python", "javascript", "html", "angular"};
			String a1 ="";
			for (int i=0 ; i<name.length; i++) {
				if (name[i].contains("a")) {
					a1 = a1.concat(name[i]);
				}
			}
			System.out.println(a1);
		}
}
