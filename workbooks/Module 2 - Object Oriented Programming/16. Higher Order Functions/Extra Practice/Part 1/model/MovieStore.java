package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    public List<Movie> filterByGenre(String genre) {
        return this.movies.stream()
                .filter(movie -> movie.getGenre().equals("Romance"))
                .toList();
    }

    public List<Movie> sortByReleaseYear() {
        return this.movies.stream()
                .sorted((right, left) -> right.getReleaseyear().compareTo(left.getReleaseyear()))
                .toList();
    }

    public List<Movie> getTopRatedMovies(double rating) {
        return this.movies.stream().sorted((right, left) -> {
            return right.getReleaseyear().compareTo((Integer) left.getReleaseyear());
        })
                .limit(5)
                .toList();
    }

    @Override
    public String toString() {
        String temp = "";
        System.out.println("\n*** Movies ***");
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString() + "\n";
        }
        return temp;
    }

}
