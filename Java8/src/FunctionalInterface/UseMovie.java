package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class UseMovie {
	public static void main(String[] args) {
		
		Movie m1 = new Movie("PS-1", "Vikram", 2022);
		Movie m2 = new Movie("Mahan", "Vikram", 2021);
		Movie m3 = new Movie("KGF" , "Yash", 2022);
		Movie m4 = new Movie("Bahubali", "Prabas", 2017);
		Movie m5 = new Movie("Vikram", "Kamal Hasan", 2022);
		Movie m6 = new Movie("Petta", "Rajinikanth", 2020);
		
		List<Movie> movies = new ArrayList<>();
		movies.add(m1);
		movies.add(m2);
		movies.add(m3);
		movies.add(m4);
		movies.add(m5);
		movies.add(m6);
		
		//m1.getMovie(movies, m-> m.getActorName().equals("Vikram"));
		m1.getMovie(movies, m-> m.getYear()==2022);
	}
}
