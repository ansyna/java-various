import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Movie;
import models.MovieStore;

public class UsingMovieTheater {

    static MovieStore movieStore = new MovieStore();
    public static void main(String[] args) {
        System.out.println("-----------------------------\nWelcome to the movie store\n");
        try {
            loadMovies("movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIES LOADED\n\n");
            System.out.println(movieStore);
            manageMovies();
        }
        
    /*    movieStore.addMovie(
            new Movie("Forest Gump", "Blue-Ray", 9)
        );
        movieStore.addMovie(
            new Movie("Show Girls", "DVD", 5)
        );
        movieStore.addMovie(
            new Movie("Matrix", "DVD", 9)
        );
        movieStore.action("Show Girls", "rent");
        movieStore.action("Forest", "rent");
        movieStore.action("Matrix", "rent");
        */
    }

    public static void loadMovies(String fileName) throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(stream); 

        while (scanner.hasNextLine()) {
           // Research how to 'split' a String into mutiple Strings.

           // Research how to parse a Double from a String (for the rating).
           // movieStore.addMovie(new Movie("Forest Gump", "Blue-Ray", 9));
        }
    }

    public static void manageMovies() {
/*
 Starts a new instance of Scanner; <-------
 *   - 2. In an infinite loop, the user can choose to a) purchase or b) rent c) return.
 *   -        case a: ask for the name and sell them the movie.
 *   -        case b: ask for the name and rent them the movie.
 *   -        case c: ask for the name and return the movie.
 *   - 3. call close() from the Scanner object.
*/
    }
}
