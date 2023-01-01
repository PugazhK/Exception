package Collection2Object;

import java.util.HashMap;
import java.util.Iterator;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ajith",28000,true,"Male");
		Employee e2 = new Employee("Kalai",26000,false,"Female");
		Employee e3 = new Employee("Nivetha",25000,true,"Female");
		
		HashMap <Integer, Employee> e = new HashMap <> ();
		e.put(1, e1);
		e.put(2, e2);
		e.put(3, e3);
		
//		for (Integer i:e.keySet()) {
//			System.out.println(i);
//		}
		int countOfMarried =0;
		for (Employee d: e.values()) {
			if(d.isMarried) {
				countOfMarried++;
			}
		}
		System.out.println("The count of married employees is "+ countOfMarried);
		
		int highSalary = e.get(1).salary;
		for (Employee d: e.values()) {
			if(highSalary<d.salary) {
				highSalary = d.salary;
			}
		}
		System.out.println(highSalary);
		
		HashMap <Integer, Employee> em = new HashMap <> ();
		for (Employee n: e.values()) {
			if (n.gender.equalsIgnoreCase("Female")) {
				em.put(1, n);
			}
		}
		System.out.println(em);
		System.out.println();
		
		int[] k = {0,1,2};
		Employee[] value = {e1,e2,e3}; 
		
		HashMap<Integer, Employee> emp = new HashMap<>();
		for(Integer i : k) {
			emp.put(i,value[i]);
		}
		for(Employee i: emp.values()) {
			System.out.println(i);
		}
		System.out.println("------------------------------------------------------------------------------");
		
		Iterator <Integer> it = e.keySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		Iterator <Employee> empl = e.values().iterator();
		while (empl.hasNext()) {
			System.out.println(empl.next());
		}
		
		System.out.println("======================================================================================");
		Iterator <Employee> emplo = e.values().iterator();
		int len = 0;
		String name = "";
		while (emplo.hasNext()) {
			Employee en = emplo.next();
			if(en.name.length()>len) {
				name = en.name;
			}
		}
		System.out.println(name);
	
	}	
}
