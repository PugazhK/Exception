package Day4;

public class FirstExercise {
	public static void main(String[] args) {
		String a [] = args[0].split(",");
		String name = a[0];
		int age = Integer.parseInt(a[1]);
		String mailId = a[2];
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(mailId);
		
	}
}
