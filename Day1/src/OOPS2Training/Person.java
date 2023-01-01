package OOPS2Training;

public class Person {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString () {
		return name + age;
	}
}
