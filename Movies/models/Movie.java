package models;

public class Movie {
    private String name;
    private String format;
    private double rating;
    private double sellingPrice;
    private double rentalPrice;
    private boolean isAvailable = true; // true = "in stock" false = "rented" 

    public Movie(String name, String format, int rating) {
        if (name == null || name.isBlank() || (format != "Blue-Ray" && format != "DVD") || rating > 10 || rating < 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        this.name = name;
        this.format = format;
        this.setSellingPrice();
        this.setRentalPrice();
        this.rating = rating;
    }

    public Movie(Movie movie) {

        if (movie.name == null || movie.name.isBlank() || (movie.format != "Blue-Ray" && movie.format != "DVD") 
            || movie.rating > 10 || rating < 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        // TODO check if name is not empty
        this.name = movie.name;
        this.format = movie.format;
        this.setSellingPrice();
        this.setRentalPrice();
        this.rating = movie.rating;
    }

    public String getFormat() {
        return format;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setFormat(String format) {

        if (format != "Blue-Ray" && format != "DVD") {
            throw new IllegalArgumentException("Illegal arguments");
        }

        this.format = format;
    }

    public void setName(String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        this.name = name;
    }

    public void setRating(double rating) {
        if (rating > 10 || rating < 0) {
            throw new IllegalArgumentException("Illegal arguments");
        }

        this.rating = rating;
    }

    public void setAvailibility(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    private void setSellingPrice() {
        // TODO throw exception if format is incorrect
        this.sellingPrice = (this.format == "DVD") ? 2.25 : 4.25;
    }

    private void setRentalPrice() {
        // TODO throw exception if format is incorrect
        this.rentalPrice = (this.format == "DVD") ? 0.99 : 1.99;
    }

    public String toString() {
        return "name: " + name + "\n" +
            "format: " + format + "\n" +
            "rating: " + rating + "\n" +
            "sellingPrice: $" + sellingPrice + "\n" +
            "rentalPrice: $" + rentalPrice + "\n" + 
            "availibility: " + (isAvailable ? "in stock ": "rented") ;
    }

    public boolean ifNameContains(String string) {
        return this.name.indexOf(string) !=-1? true: false;
    }
}
