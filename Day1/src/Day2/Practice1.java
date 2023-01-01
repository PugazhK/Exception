package Day2;

public class Practice1 {
	public static void main(String [] args) {
		
		String line1 = "Rose is a flower";
		boolean startsWith = line1.startsWith("Rose");
		
		String line2 = "Hello";
		int index = line2.indexOf("l");
		
		String line3 = "world";
		char charAt = line3.charAt(2);
		
		String line4 = "Programming";
		String sub = line4.substring(0,7);
		
		System.out.println(startsWith);
		System.out.println(index);
		System.out.println(charAt);
		System.out.println(sub);
		
		
		System.out.println(line1.startsWith("Rose"));
		System.out.println(line2.indexOf("l"));
		System.out.println(line3.charAt(2));
		System.out.println(line4.substring(0,7));
		
		
	}
}
