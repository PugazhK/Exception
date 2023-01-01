package Bike;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("PULSAR", 120000, "TN22CM4048", "Black");
		Bike b2 = new Bike("ACTIVA", 80000, "PY04AN1798", "Blue");
		Bike b3 = new Bike("DUKE", 220000, "TN01DL5555", "White");

		HashMap<String, Bike> details = new HashMap<>();
		details.put(b1.getVehicleNumber(), b1);
		details.put(b2.getVehicleNumber(), b2);
		details.put(b3.getVehicleNumber(), b3);
		
		System.out.println(details);

		for (String ks : details.keySet()) {
			System.out.println(ks);
		}

		System.out.println("======================================================");

		// printing values//

		for (Bike val : details.values()) {
			System.out.println(val);
		}

		System.out.println("=======================================================");

		for (String det : details.keySet()) {
			System.out.println(details.get(det));
		}

		System.out.println("=======================================================");

		//////////// FOR EACH ////////////////

		details.keySet().forEach(x -> {
			System.out.println(x);
		});

		details.values().forEach((y) -> {
			System.out.println(y);
		});
		
		details.keySet().forEach((z)->{System.out.println(details.get(z));});
		
		System.out.println("========================================================");
		
		Iterator <Bike> b = details.values().iterator();
		
		while (b.hasNext()) {
			if(b.next().getColor().equals("Black")) {
				b.remove();
			}
		}
		
		for (Bike bike: details.values()) {
			System.out.println(bike);
		}
		
//		for (Bike n: details) {
//			
//		}
		
	}
}
