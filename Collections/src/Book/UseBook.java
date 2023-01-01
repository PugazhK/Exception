package Book;

import java.util.ArrayList;

public class UseBook {
	public static void main(String[] args) {
		Book b1 = new Book("idiots",600,1200);
		Book b2 = new Book("secrets",600,1200);
		Book b3 = new Book("Sychopath",600,1200);
		
		ArrayList <Book> b = new ArrayList <> ();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		ArrayList <Book> a = new ArrayList <> ();
		for (Book n: b) {
			char l = n.name.charAt(n.name.length()/2);
			if (l=='a'|| l=='e'||l=='i'||l=='o'||l=='u') {
				a.add(n);
			}
		}
		for (Book i:a) {
			System.out.println(i);
		}
	}
}
