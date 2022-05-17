import java.util.Arrays;

public class UsingCar {
    public static void main(String[] args) {

        Car[] cars = new Car[] {
            new Car("BMW", 30000, 2019, "Red", new String[] {"tires", "keys"}),
            new Car("audi", 29000, 2018, "Blue", new String[] {"tires", "keys"}),
            new Car("audi", 29700, 2018, "yellow", new String[] {"tires", "keys"})
        };  
        //System.out.println(bmw);
        //System.out.println(otherAudi);  
        //System.out.println(audi);  

        Dealership dealership = new Dealership(cars);

        /* 
        
        for (int i = 0; i < cars.length; i++) {
            dealership.setCar(cars[i], i);
        }
        
        */
        
        //dealership.sell(2);
        System.out.println(dealership.search("audi", 29100));

        System.out.println(dealership.search("ford", 29100));
    }
}