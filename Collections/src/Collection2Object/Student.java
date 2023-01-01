package Collection2Object;

public class Student {
	String name;
	int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String setName() {
		return this.name;
	}
	
	public int setAge () {
		return this.age;
	}
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString () {
		return "Name is " + name + ", Age is " + age;
	}
}
