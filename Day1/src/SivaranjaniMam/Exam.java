package SivaranjaniMam;

public class Exam {
	String name;
	int age;
	
	public String cf(int m, int p, int c) {
		return "Engineering " + (m*p*c)/3;
	}
	public String cf (int bi, int ch) {
		return "Medical " + (bi*ch)/2;
	}
	
}
