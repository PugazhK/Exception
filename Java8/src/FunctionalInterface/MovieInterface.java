package FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

public interface MovieInterface {
	public void getMovie(List<Movie> movies, Predicate<Movie> moviePredicate);
}
