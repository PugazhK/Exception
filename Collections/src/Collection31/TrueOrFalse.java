package Collection31;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TrueOrFalse {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(35);
		
		List<Boolean> l = a1.stream().map(x->x>10).collect(Collectors.toList());
		for(Boolean b:l) {
			System.out.println(b);
		}
		
		List<Integer> sq = a1.stream().map(x->x*x).collect(Collectors.toList());
		for(Integer square:sq) {
			System.out.println(square);
		}
	}
}
