import java.util.Scanner;

import javax.crypto.MacSpi;

public class UsingMachine {
    public static void main(String[] args) {

        Item[][]items = new Item[][] {
            {
                new Item("cola", 1.20, 3),
                new Item("twix", 2.20, 1),
                new Item("pringles", 2.10, 2)
            },
            {
                new Item("sprite", 1.20, 2),
                new Item("mars", 2.20, 1),
                new Item("peanuts", 2.10, 2)
            },
            {
                new Item("fanta", 1.20, 2),
                new Item("snickers", 2.20, 1),
                new Item("pretsels", 2.10, 2)
            }
        };
        
        Machine machine = new Machine(items);
        System.out.println(machine);
        

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Pick a row: "); 
            // pick up row. 
            int row = scanner.nextInt();
            System.out.print("Pick a spot in the row: "); 
            // pick up spot.
            int spot = scanner.nextInt();

            machine.dispense(row, spot);
            System.out.println(machine);
        }
    }
}
