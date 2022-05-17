import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");
        
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        System.out.println("Hello " + firstName + "!");
    }
}