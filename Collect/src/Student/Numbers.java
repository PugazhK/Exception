package Student;

import java.util.ArrayList;

public class Numbers {
	public static void main(String[] args) {
		int num1=12;
		int num2=14;
		int num3 =16;
		int num4 =18;
		int num5 =20;
		
		ArrayList <Integer> nums = new ArrayList <> ();
		
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		nums.add(num4);
		nums.add(num5);
		
		for(int x : nums) {
			System.out.println(x);
		}
		
		// self task //
		
		ArrayList <Integer> num = new ArrayList<> ();
		
		for (int i=1; i<=10; i++) {
			num.add(i);
		}
		num.forEach((x)-> {
			System.out.println(x);
		});
	}
}
