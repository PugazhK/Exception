package collection1;

import java.util.*;

public class Iteration {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
		li.add(45);
		li.add(56);
		li.add(67);
		li.add(78);
		li.add(89);
		li.add(34);

		for (int i = 0; i < li.size(); i++) {
			if (li.get(i) % 2 == 0) {
				System.out.println(li.get(i) + " is Even");
			} else {
				System.out.println(li.get(i) + " is Odd");
			}
		}

//		for(Integer i:li) {
//			if(i%2==0) {
//				System.out.println(i+" is Even Number");
//			}
//			else {
//				System.out.println(i+" is Odd Number");
//			}
//		}

		li.forEach((x) -> {
			if (x % 2 == 0) {
				System.out.println(x + " Even");
			}
			else {
				System.out.println(x + " Odd");
			}
		});
	}
}
