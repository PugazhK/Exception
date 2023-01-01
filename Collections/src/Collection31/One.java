package Collection31;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class One {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("one");
		a.add("Two");
		a.add("Three");
		a.add("Four");

		List<Boolean> b = a.stream().map(x -> x.startsWith("o")).collect(Collectors.toList());
		for (Boolean bo : b) {
			System.out.println(bo);
		}

		System.out.println(
				"===========================Lengths of the above String========================================");

		List<Integer> len = a.stream().map(x -> x.length()).collect(Collectors.toList());
		len.forEach(x -> {
			System.out.println(x);
		});

		System.out.println(
				"=======================================SubString==============================================");

		List<String> ss = a.stream().map(x -> x.substring(0, 2)).collect(Collectors.toList());
		ss.forEach(x -> {
			System.out.println(x);
		});

		System.out.println(
				"=====================================Char At==================================================");

		List<Character> ch = a.stream().map(x -> x.charAt(x.length() / 2)).collect(Collectors.toList());
		ch.forEach(x -> {
			System.out.println(x);
		});

		System.out.println(
				"====================================Index of Method===========================================");

		List<Integer> ind = a.stream().map(x -> x.indexOf('o')).collect(Collectors.toList());
		ind.forEach(x -> {
			System.out.println(x);
		});
		System.out.println(
				"======================================Filter Method===========================================");
		
		List<String> fil = a.stream().filter(x-> x.contains("w")).collect(Collectors.toList());
		fil.forEach(x-> {
			System.out.println(x);
		});
		System.out.println(
				"=================================Filter Method with Map=======================================");
		List<Integer> le = a.stream().filter(x-> x.contains("r")).map(y-> y.length()).collect(Collectors.toList());
		le.forEach(z-> {
			System.out.println(z);
		});
	}
}
