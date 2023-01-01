package Employee;

public class Employee {
	 private String name;
	 private int age;
	 private int id;
	 private String gender;
	 private int salary;
	 
	 public String getName() {
		 return name;
	 }
	 
	 public void setSalary(int salary) {
		 this.salary = salary;
	 }
	 
	 public int getSalary() {
		 return salary;
	 }
	 
	 public void setGender(String gender) {
		 this.gender = gender;
	 }
	 
	 public String getGender() {
		 return gender;
	 }
	 
	 public Employee(String name, int age, int id, String gender, int salary){
		 this.name = name;
		 this.age = age;
		 this.id = id;
		 this.gender = gender;
		 this.salary = salary;
	 }
	 
	
	public String toString() {
		 return "Name of the Employee "+name+
				 ", Age of the Employee "+age+
				 ", id of the Employee "+id+
				 ", Gender of the Employee "+gender+
				 ", salary of the Employee "+salary;		 
	 }
}
