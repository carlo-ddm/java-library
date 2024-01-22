package model;

public class Movie {

    private String title;
    private String director;
    private String genre;
    private int releaseYear;
    private double rating;

    public Movie(String title, String director, String genre, int releaseYear, double rating) {
        setTitle(title);
        setDirector(director);
        setGenre(genre);
        setReleaseYear(releaseYear);
        setRating(rating);
    }

    public Movie(Movie source) {
        setTitle(source.title);
        setDirector(source.director);
        setGenre(source.genre);
        setReleaseYear(source.releaseYear);
        setRating(source.rating);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getReleaseyear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double ratinng) {
        this.rating = ratinng;
    }


    @Override
    public String toString() {
        return
            "\ntitle: " + getTitle() +
            "\ngenre: " + getGenre() +
            "\nreleaseYear: " + getReleaseyear() +
            "\nrating: " + getRating();
    }


}
