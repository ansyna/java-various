import java.util.Arrays;

public class Shirt {
 
    String brand;
    double price;
    String size;
    String[] buttons;
 
    public Shirt(String brand, double price, String size, String[] buttons) {
        this.brand = brand;
        this.size = size;
        this.price = price;
        this.buttons = Arrays.copyOf(buttons, buttons.length);
    }

    public String toString() {
        return ("Brand: " + this.brand + "\n" + 
            "Price: " + this.price + "\n" + 
            "Size: " + this.size + "\n" + 
            Arrays.toString(this.buttons)
        );
    }
}