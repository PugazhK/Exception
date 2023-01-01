package Collection2Object;

public class Employee {
	String name;
	int salary;
	boolean isMarried;
	String gender;
	
	public Employee (String name, int salary, boolean isMarried, String gender) {
		this.name = name;
		this.salary=salary;
		this.isMarried=isMarried;
		this.gender=gender;
	}
	
	public String toString () {
		return "Name "+name+", Salary"+salary+", Is he/she Married "+isMarried+", Gender "+gender;
	}
}
