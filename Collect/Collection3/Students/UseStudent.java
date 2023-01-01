package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student std1 = new Student(1, "Bhavani", "CSE", 80);
		Student std2 = new Student(2, "Pragadheesh", "Cse", 100);
		Student std3 = new Student(3, "Arun", "BCA", 90);
		Student std4 = new Student(4, "Pugazh", "BCA", 90);
		Student std5 = new Student(5, "Viji", "Bio-Tech", 80);

		ArrayList<Student> li = new ArrayList<>();
		li.add(std1);
		li.add(std2);
		li.add(std3);
		li.add(std4);
		li.add(std5);

		List<Student> l1 = li.stream().filter(x -> x.getName().startsWith("A")).collect(Collectors.toList());

		for (Student st : l1) {
			System.out.println(st);
		}

		l1.forEach(x -> System.out.println(x));
		
//		l1.forEach(x->{
//			if(x.getMarks()>90) {
//				System.out.println(x);
//			}
//		});
		
		//List<Student>l = 
		li.stream().filter(x-> x.getMarks()>90).forEach(y->System.out.println(y));
		//.collect(Collectors.toList());
//		for (Student i : l) {
//			System.out.println(i);
//		}
		
		li.stream().filter(x-> x.getMarks()>90).forEach(y-> System.out.println(y));
		
		List<String>l3 = li.stream().map(x->x.getBranch()).collect(Collectors.toList());
		for(String k: l3) {
			System.out.println(k);
		}
		
		li.stream().map(p-> p.getMarks()).forEach(z-> System.out.println(z));
		
		li.stream().filter(n-> n.getMarks()>90).map((m)-> m.getName()).forEach(o-> System.out.println(0));
		
		long a = li.stream().filter(x-> x.getName().startsWith("P")).map(y-> y.getName()).count();
		System.out.println(a);
	}
}
