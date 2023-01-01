package SivaranjaniMam;

public class UseExam {
	public static void main(String[] args) {
		Exam s1 = new Exam();
		s1.name = "pragadheesh";
		s1.age = 22;
		
		Exam s2 = new Exam();
		s2.name = "Arun";
		s2.age = 24;
		
		Exam [] e = {s1,s2};
		System.out.println(s1.cf(30, 60, 40));
	}
}
