import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
                break;
            } else {
                scanner.nextLine();
                System.out.println("it's not an int");
            }
        }
    }
}
