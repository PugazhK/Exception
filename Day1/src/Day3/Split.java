package Day3;

public class Split {
	public static void main(String [] args){
		String a = "welcome#Raki";
		String[] b = a.split("#");
		System.out.println(b[0]);
		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b.length);
		String n = "hello";
		String [] na = n.split("l");
		System.out.println(na[0]);
		System.out.println(na[1]);
		System.out.println(na[2]);
	}
}
