package Test;

import java.util.ArrayList;

public class Testing {
	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList <> ();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(2,8);
		for(int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
}
