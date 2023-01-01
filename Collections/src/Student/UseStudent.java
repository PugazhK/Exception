package Student;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Pugazh", 18, "Male", 69, 'A');
		Student s2 = new Student("Keerthana", 20, "Female", 94, 'A');
		Student s3 = new Student("Pragadheesh", 24, "Male", 54, 'A');
		Student s4 = new Student("viji", 18, "Female", 76, 'A');
		Student s5 = new Student("Arun", 24, "male", 79, 'A');
		Student s6 = new Student("Bharathi", 45, "Female", 87, 'A');

		ArrayList<Student> li = new ArrayList<>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s4);
		li.add(s5);
		li.add(s6);

		ArrayList<Student> femaleli = new ArrayList<>();
		for (Student x : li) {
			if (x.getGender().equalsIgnoreCase("female")) {
				femaleli.add(x);
			}
		}
		System.out.println(femaleli);

		ArrayList<Student> maleli = new ArrayList<>();
		for (Student k : li) {
			if (k.getGender().equalsIgnoreCase("male")) {
				maleli.add(k);
			}
		}
		for(Student i: maleli) {
			System.out.println(i);
		}
		

		li.forEach((x) -> {
			if (x.getMark() >= 70) {
				System.out.println(x + " they are topper");
			}
			else {
				System.out.println(x + " they are average");
			}
			
		});
		
		ArrayList<Student> topper = new ArrayList <> ();
		li.forEach((x) -> {
			if (x.getMark() >= 70) {
				topper.add(x);
			}
		});
		System.out.println(topper);
		for(Student s : topper) {
			System.out.println(s);
		}

	}

}
