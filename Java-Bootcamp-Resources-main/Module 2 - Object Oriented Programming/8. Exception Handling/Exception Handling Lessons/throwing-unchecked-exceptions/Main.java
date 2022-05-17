import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee stocker = new Employee("baadad", "sdfsd");
        Employee assisManager = new Employee("Nicholas", "dfgdfg");
        Employee manager = new Employee("sdfsd", "dfg");

        Store store = new Store();
        store.setEmployees(1,stocker);
        store.setEmployees(2,assisManager);
        store.setEmployees(0,manager);

        System.out.println(store);
        store.open();
        
    }
}
