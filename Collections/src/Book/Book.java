package Book;

public class Book {
	String name;
	int price;
	int pages;
	
	public Book(String name, int price, int pages) {
		this.name=name;
		this.price=price;
		this.pages=pages;
	}
	
	public String toString () {
		 return "Name "+name+", price "+price+", pages "+pages;
	}
}
