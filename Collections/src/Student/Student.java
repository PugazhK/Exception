package Student;

public class Student {
	private String name;
	private int id;
	private String gender;
	private int mark;
	private char sec;
	
	public void setName (String name) {
		this.name = name;
	}
	public void setId (int id) {
		this.id = id;
	}
	public void setGender (String gender) {
		this.gender = gender;
	}
	public void setMark (int mark) {
		this.mark = mark;
	}
	public void setName (char sec) {
		this.sec = sec;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getGender() {
		return gender;
	}
	public int getMark() {
		return mark;
	}
	public char getSec() {
		return sec;
	}
	
	public Student (String name, int id, String gender, int mark, char sec) {
		this.name= name;
		this.id = id;
		this.gender= gender;
		this.mark = mark;
		this.sec = sec;
	}
	
	public String toString() {
		return "Name " + name + ", ID " + id + ", Gender " + ", Mark "+ mark + ", Section "+ sec;
	}
	
}
