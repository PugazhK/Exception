package OOPS2Training;

public class Employee extends Person {
	private int empID;
	
	public  void setempIp() {
		this.empID = empID;
	}
	public int getempID() {
		return empID;
	}
	
	public Employee (String name, int age, int empID) {
		super (name,age);
		this.empID = empID;
		
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("pugazh",24,534);
	}
}


