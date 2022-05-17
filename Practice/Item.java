public class Item {
    private String name; 
    private double price; 
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item item) {
        this.name = item.name;
        this.price = item.price;
        this.quantity = item.quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return (
            "Name: " + this.name + "\n" + 
            "Quantity: " + this.quantity + "\n" + 
            "Price: " + this.price + "\n"
        );
    }
}
