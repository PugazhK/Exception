package collection1;
import java.util.*;

public class CharIteration {
	public static void main(String[] args) {
		ArrayList <Character> li = new ArrayList<> ();
		li.add('A');
		li.add('B');
		li.add('C');
		li.add('D');
		li.add('E');
		li.add('F');
		
		for (int i=0; i<li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		for (Character i: li) {
			System.out.println(i);
		}
		
	}
}
