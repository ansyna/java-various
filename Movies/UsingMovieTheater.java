import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import models.Movie;
import models.MovieStore;

public class UsingMovieTheater {

    static MovieStore movieStore = new MovieStore();
    public static void main(String[] args) {
        System.out.println("-----------------------------\nWelcome to the movie store\n");
        try {
            loadMovies("Movies/moviesList.txt");
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
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanFile = new Scanner(fis);

        while (scanFile.hasNextLine()) {
            String line = scanFile.nextLine();
            System.out.println(line);
            String[] stringElements = line.split("--", 3);

            System.out.println(Double.parseDouble(stringElements[2]));
            System.out.println(stringElements[1]);
            System.out.println(stringElements[0]);
            movieStore.addMovie(
                new Movie(stringElements[0],stringElements[1],Double.parseDouble(stringElements[2]))
            ); 
        }
        scanFile.close();
    }

    public static void manageMovies() {
        try (Scanner scanner = new Scanner(System.in)) {
            while(true) {
                System.out.println("\nWould you like to \n\ta) purchase\n\tb) rent \n\tc) return.");
                boolean wasStoreChanged = false;

                String selectOption = scanner.nextLine();

                if (!selectOption.equals("a") && !selectOption.equals("b") && !selectOption.equals("c")) {
                    System.out.println("you can only enter a) b) and c)");
                    continue;
                }
                System.out.println("Enter name");
                String name = scanner.nextLine();
                int movieIndex = movieStore.searchMovie(name);
                if (movieIndex == -1) {
                    System.out.println("Movie not found. Try again");
                    continue;
                }
                switch (selectOption) {
                    case "a":
                        if (movieStore.getMovie(movieIndex).isAvailable()) {
                            wasStoreChanged = movieStore.action(name, "sell");
                        } else {
                            System.out.println("Movie is not availible. Sorry");
                        }
                        break;
                    case "b":
                        wasStoreChanged = movieStore.action(name, "rent");
                        break;
                    case "c":
                        wasStoreChanged = movieStore.action(name, "return");
                        break;
                }
                if (wasStoreChanged) {
                    System.out.println("MOVIES UPDATED\n\n");
                    System.out.println(movieStore);
                }
            }
        }
    }
}
