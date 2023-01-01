package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public class Movie implements MovieInterface{
	
	private String name;
	private String actorName;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	public Movie(String name, String actorName, int year) {
		super();
		this.name = name;
		this.actorName = actorName;
		this.year = year;
	}
	
	public void getMovie(List<Movie> movies, Predicate<Movie> moviePredicate) {
		for(Movie m : movies) {
			if(moviePredicate.test(m)) {
				System.out.println(m.getActorName());
			}
		}
	}
	
	
}
