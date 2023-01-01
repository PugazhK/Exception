package Pen;

import java.util.ArrayList;

public class Pen {
	public static void main(String[] args) {
		ArrayList <String> brandName = new ArrayList <> ();
		brandName.add("Cello");
		brandName.add("Reynolds");
		brandName.add("Montex");
		brandName.add("Rorito");
		brandName.add("Parker");
		
		for(int i=0; i<brandName.size();i++) {
			System.out.println(brandName.get(i).charAt(brandName.get(i).length()-1));
		}
		
		System.out.println("==================");
		
		String val = "";
		for(int i=0; i<brandName.size();i++) {
			val=val+brandName.get(i);
		}
		System.out.println(val);
		
		System.out.println("=================");
		
		int maxLen = 0;
		String maxString = "";
		for (String s: brandName) {
			if(s.length()>maxLen) {
				maxLen = s.length();
				maxString = s;
			}
		}
		System.out.println(maxString);
		System.out.println("================");
		
		//printing all the values using forEach //
		brandName.forEach((x)-> System.out.println(x));
		System.out.println("================");
	}
}
