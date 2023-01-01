package RegEx;

public class RegularExpressions {
	public static void main(String[] args) {
		String a = "TN 07Ah47M";
		String [] b = a.split("[0-9]"); // "[a-zA-Z]"   "||"   "\\D"  "\\d"  
		String c = "";
		for(int i=0; i<b.length; i++) {
			//System.out.println(b[i]);
			c=c+b[i];
		}
		System.out.println(c);
	}
}
