package Student;

public class Student {
	private String name;
	private int id;
	private int age;
	private String gender;
	
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setid() {
		this.id = id;
	}
	public int getid() {
		return id;
	}
	
	public void setAge() {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender() {
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	
	public Student (String name, int id, int age, String gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString() {
		return name + " " + id + " " + age + " " + gender;
	}
}
