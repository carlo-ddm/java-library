import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        // TODO
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        // TODO
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        // TODO
        this.movies.add(new Movie(movie));
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}