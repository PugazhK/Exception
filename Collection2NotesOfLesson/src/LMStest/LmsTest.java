package LMStest;

import java.util.HashMap;
import java.util.Iterator;

public class LmsTest {
	public static void main(String[] args) {
		HashMap <Integer,String> testDetails = new HashMap <> ();
		testDetails.put(531, "Pugazh");
		testDetails.put(532, "Pragadheesh");
		testDetails.put(534, "Arun");
		testDetails.put(533, "Viji");
		
		System.out.println(testDetails.keySet());
		
		for (Integer k : testDetails.keySet()) {
			System.out.println(k);
		}
		for (String m : testDetails.values()) {
			System.out.println(m);
		}
		
		for (Integer l : testDetails.keySet()) {
			System.out.println(testDetails.get(l));
		}
		
		testDetails.forEach((x,y)-> System.out.println(x+" "+y));
		testDetails.keySet().forEach(x-> System.out.println(x));
		
		System.out.println(testDetails);
		
		Iterator <String> details = testDetails.values().iterator();
		
		while (details.hasNext()) {
				if(details.next().startsWith("P")) {
					details.remove();
				}
			}
		for(String i : testDetails.values()) {
			System.out.println(i);
		}
	}
}
