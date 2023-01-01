package Loan;

import java.util.HashMap;
import java.util.Iterator;

public class UseLoan {
	public static void main(String[] args) {
		Loan l1 = new Loan(60000, 12, 5, 24);
		Loan l2 = new Loan(70000, 13, 10, 12);
		Loan l3 = new Loan(100000, 14, 2, 36);
		Loan l4 = new Loan(50000, 15, 4, 20);

		HashMap<Integer, Loan> ldetails = new HashMap<>();
		ldetails.put(l1.getLoanNumber(), l1);
		ldetails.put(l2.getLoanNumber(), l2);
		ldetails.put(l3.getLoanNumber(), l3);
		ldetails.put(l4.getLoanNumber(), l4);

		ldetails.keySet().forEach((x) -> {
			System.out.println(ldetails.get(x));
		});
		System.out.println("=======================================================");

		for (Loan i : ldetails.values()) {
			System.out.println((i.getLoanAmount() * i.getInterest() * i.getMonths()) / 100);
		}
		System.out.println("========================================================");

		int max = 0;
		for (Loan j : ldetails.values()) {
			if (j.getLoanAmount() > max) {
				max = j.getLoanAmount();
			}
		}
		System.out.println(max);
		System.out.println("=========================================================");

		Iterator<Loan> l = ldetails.values().iterator();

		while (l.hasNext()) {
			if (l.next().getMonths() < 20) {
				l.remove();
			}
		}

		for (Loan ln : ldetails.values()) {
			System.out.println(ln);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");

		ldetails.keySet().forEach((x) -> {
			System.out.println(ldetails.get(x));
		});

	}
}
