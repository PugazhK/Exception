package Collection2Object;

import java.util.HashMap;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Arun", 24);
		Student s2 = new Student("Pragadheesh", 22);
		Student s3 = new Student("Pugazh", 21);

		HashMap<Integer, Student> is = new HashMap<>();
		is.put(1, s1);
		is.put(2, s2);
		is.put(3, s3);

		System.out.println(is);

		for (Integer k : is.keySet()) {
			System.out.println(k);
		}
		for (Student n : is.values()) {
			if (n.name.endsWith("h")) {
				System.out.println(n);
			}
		}
	}
}
