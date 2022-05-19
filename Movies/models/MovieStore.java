package models;

import java.util.ArrayList;

public class MovieStore {

    private ArrayList<Movie> movies;

    public MovieStore() {
        this.movies = new ArrayList<Movie>();
    }
    
    public Movie getMovie(int index) {
        return this.movies.get(index);
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    public void action(String movieName, String action) {
        if (movieName == null || movieName.isBlank() || (action != "sell" && action != "rent" && action != "return")) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        if (this.movies.isEmpty()) {
            throw new IllegalStateException("Movie store does not have any movies"); 
        }

        int index = this.searchMovie(movieName);
        Movie movie = this.movies.get(index);

        if (index != -1) {
            switch (action) {
                case "sell":
                    //Removes the movie that matches the name passed in.
                    if (movie.isAvailable()) {
                        this.movies.remove(index);
                        System.out.println(movie.getName() + " is sold");
                    } else {
                        throw new IllegalStateException("this movie is already rented - cannot be sold"); 
                    }
                    break;
                case "rent":
                    // Sets isAvailable equal to false.
                    if (movie.isAvailable()) {
                        this.movies.get(index).setAvailibility(false);
                        System.out.println(movie.getName() + "is rented");
                    } else {
                        throw new IllegalStateException("this movie is already rented - cannot be sold"); 
                    }
                    break;
                case "return":
                    // Sets isAvailable equal to true.
                    this.movies.get(index).setAvailibility(true);
                    System.out.println(movie.getName() + "is returned");
                    break;
            }
        } else {
            System.out.println("Movie not found");
        }
    }

    private int searchMovie(String movieName) {
        if (movieName == null || movieName.isBlank()) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        int index = -1;
        for (int i = 0; i < this.movies.size(); i++) {
            if (this.movies.get(i).ifNameContains(movieName)){
                // for simplicity returning the first available movie  
                index = i;
                break;
          }
        }
        return index;
    }

    public String toString() {
        String tempStr = "-----------------\nHere is the list of movies \n\n";
        for (int i = 0; i < this.movies.size(); i++) {
            tempStr += this.movies.get(i).toString() + "\n\n";
        }

        return tempStr;
    }
}
