import java.util.Arrays;

public class Dealership {
 
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    } 

    public void sell(int index) {
        this.cars[index].drive();
        this.cars[index] = null;
        System.out.println("sold the car");
    }

    public String search(String make, double budget) {

        for (int i = 0; i < this.cars.length; i++){
            if (this.cars[i] == null) {
                continue;
            } else  if (make == this.cars[i].getMake() 
                && this.cars[i].getPrice() <= budget) {
                    return "Here is your car:" + "\n" + this.cars[i].toString();
                }
        }

        return "Sorry we didn't find any cars";
    }
}