public class Machine {
    Item[][] items;

    public Machine(Item[][] items) {
        this.items = new Item[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        } 
    }

    public Item getItem(int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    public void setItem(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }
    
    public boolean dispense(int row, int spot) {
        int quantity = this.items[row][spot].getQuantity();
        if (quantity > 0) {
            this.items[row][spot].setQuantity(quantity - 1);
            System.out.println("enjoy");
            return true;
        }
        System.out.println("sorry we are out");
        return false;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Item tempItem = new Item (this.items[i][j]);
                temp += tempItem.getName() + ": " + tempItem.getPrice() + " (" + tempItem.getQuantity() + ") ";
                if (j == 2) {
                    temp += "\n";
                }
            }
        }

        return temp;
    }
}
