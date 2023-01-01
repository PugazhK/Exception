package Student;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student ("Guru",56454,23,"male");
		Student s2 = new Student ("charu",56754,21,"female");
		Student s3 = new Student ("pirai",52354,24,"male");
		Student s4 = new Student ("mathi",56554,19,"female");
		
		ArrayList <Student> std = new ArrayList <> ();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);
		
		std.get(0).getName();
		
		int max = 0;
		String maxName = "";
		Student maxIndex = null;
		
		for (Student k: std) {
			if(k.getAge()>max && k.getGender().equalsIgnoreCase("male")) {
				max = k.getAge();
				maxName = k.getName();
				maxIndex =k;
			}	
		}
		System.out.println(maxIndex.getName());
		
		ArrayList <Student> femaleStudents = new ArrayList <> ();
		
		
		
		for (Student x : std ) {
			if(x.getGender().equalsIgnoreCase("female")) {
				femaleStudents.add(x);
			}
		}
		
		femaleStudents.forEach((y)-> {
			System.out.println(y);
		});
	}	
}
