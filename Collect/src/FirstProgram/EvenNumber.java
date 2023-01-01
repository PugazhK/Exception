package FirstProgram;

import java.util.ArrayList;

public class EvenNumber {
	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);
		
		nums.remove(0);
		
		System.out.println(nums.get(0));
		
		nums.set(0,2);
		System.out.println(nums);

//		for (Integer num: nums) {
//			if(num%2==0) {
//				System.out.println(num);
//			}
//		}

//		for (int i=0; i<nums.size();i++) {
//			if(nums.get(i)%2==0) {
//				System.out.println(nums.get(i));
//			}
//			
//		}

		nums.forEach(x -> {
//			if(x%2==0) {
				System.out.println(x);
//			}
		});
	}
}
