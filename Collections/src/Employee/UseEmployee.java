package Employee;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee("Pugazh ", 21, 534, "Male", 20000);
		Employee e2 = new Employee("Pragadhessh ", 22, 533, "Male", 20000);
		Employee e3 = new Employee("Arun ", 24, 532, "Male", 20000);
		Employee e4 = new Employee("Keerthana ", 23, 531, "Female", 25000);
		Employee e5 = new Employee("Viji ", 28, 530, "Female", 22000);
		Employee e6 = new Employee("Mani ", 30, 430, "Male", 30000);
		Employee e7 = new Employee("Prakash ", 29, 350, "Male", 35000);
		Employee e8 = new Employee("Sangeetha ", 21, 540, "Female", 20000);
		Employee e9 = new Employee("Kamesh ", 20, 542, "Male", 22000);
		Employee e10 = new Employee("Dhivya ", 24, 400, "Female", 22000);
		
		ArrayList <Employee> e = new ArrayList <> ();
		
		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		e.add(e6);
		e.add(e7);
		e.add(e8);
		e.add(e9);
		e.add(e10);
		/*
		for(int i=0; i<e.size(); i++) {
			if(e.get(i).getSalary() >20000) {
				System.out.println(e.get(i).getSalary());
			}
		}	
		e.forEach ((x)-> {if (x.getGender().equalsIgnoreCase("Male")) {System.out.println(x);}});
		*/
		ArrayList <Employee> high = new ArrayList <> ();
		ArrayList <Employee> low = new ArrayList <> ();
		for(Employee i:e) {
			if(i.getSalary()>25000) {
				high.add(i);
				System.out.println(i.getName().toUpperCase());
			}
			else {
				low.add(i);
			}
		}
		for(Employee i:high) {
			System.out.println(i);
		}
	
	
	
	}
}

