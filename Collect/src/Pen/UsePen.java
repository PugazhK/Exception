package Pen;

import java.util.ArrayList;

public class UsePen {
	public static void main(String[] args) {
//		Pen p1 = new Pen("cello",10,"blue");
//		Pen p2 = new Pen("Parker",60,"black");
		Pen p3 = new Pen("Reynolds",5,"blue");
		Pen p4 = new Pen("Flair",30,"Red");
		
		ArrayList <Pen> pens = new ArrayList <>();
		pens.add(new Pen("cello",10,"blue"));
		pens.add(new Pen("cello",10,"blue"));
		pens.add(p3);
		pens.add(p4);
		
//		int max = 0;
//		for (int i=0; i<pens.size(); i++) {
//			if(pens.get(i).getPrice()>max) {
//				max = pens.get(i).getPrice();
//			}
//		}
//		System.out.println(max);
		int max =0;
		Pen maxPen = null;
		for (Pen pen:pens) {
			if(pen.getPrice()>max) {
				max = pen.getPrice();
				maxPen = pen;
			}
		}
		System.out.println(max);
		System.out.println(maxPen.getBrand());
		
	}
}
