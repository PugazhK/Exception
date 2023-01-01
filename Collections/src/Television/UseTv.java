package Television;

import java.util.HashMap;
import java.util.Iterator;

public class UseTv {
	public static void main(String[] args) {
		Tv tv1 =new Tv("Sony",49,80000,"OLED");
		Tv tv2 =new Tv("Samsung",32,50000,"LED");
		Tv tv3 =new Tv("LG",42,60000,"LCD");
		
		HashMap <Integer, Tv> tv = new HashMap <> ();
		tv.put(1, tv1);
		tv.put(2, tv2);
		tv.put(3, tv3);
		
		System.out.println(tv);
		System.out.println("======================================================================================");
		
		Iterator <Tv> t = tv.values().iterator();
		while (t.hasNext()) {
			Tv vt = t.next();
			if(vt.inch>40) {
				System.out.println(vt);
			}
		}
		System.out.println("======================================================================================");
		
		// using for each:
		tv.forEach((k,v)-> {
			if(v.price<60000) {
				System.out.println(v);
			}
		});
		
	}
}
