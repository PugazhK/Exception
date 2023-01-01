package Collection2HashMap;

import java.util.HashMap;

public class Second {
	public static void main(String[] args) {
		HashMap <String, String> ss = new HashMap<>();
		ss.put("one", "Arun");
		ss.put("two", "Pugazh");
		ss.put("three", "Pragadheesh");
		System.out.println(ss);
		
		HashMap <Character, Float> cf = new HashMap<>();
		cf.put('A',35.09f);
		cf.put('B',34.56f);
		cf.put('C',54.03f);
		System.out.println(cf.get('B'));
	}
}
