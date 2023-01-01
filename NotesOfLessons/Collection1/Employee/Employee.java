package Employee;

import java.util.ArrayList;

public class Employee {
	public static void main(String[] args) {
		ArrayList <Integer> empId = new ArrayList <> ();
		empId.add(1);
		empId.add(2);
		empId.add(3);
		empId.add(4);
		empId.add(5);
		
		System.out.println(empId);
		empId.set(4,10);
		System.out.println(empId);
		empId.remove(0);
		System.out.println(empId);
		
		for (int i=0; i<empId.size();i++) {
			System.out.println(empId.get(i));
		}
		
		for (Integer k: empId) {
			System.out.println(k);
		}
		
		empId.forEach(x-> System.out.println(x));
		
		System.out.println("=======================================");
		
		//finding odd even//
		
		for (int i=0; i<empId.size(); i++) {
			if(empId.get(i)%2==0) {
				System.out.println(empId.get(i) + "is an even number");
			}
			else {
				System.out.println(empId.get(i) + "is an Odd number ");
			}
		}
		System.out.println("========================================");
		empId.forEach(x-> {if(x%2==0) {System.out.println(x + "is an even number");} else {System.out.println(x + "is an odd number");}});
		System.out.println("============================================");
		//finding highest number using enhanced for loop//
		
		int max = 0;
		for (int k : empId) {
			if (k>max) {
				max =k;
			}
		}
		System.out.println(max);
		System.out.println("================================");
	}
}
