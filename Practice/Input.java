import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       try {
        load();
        } catch (FileNotFoundException e) {
            System.out.println("not found");
        }

        try {
            URL url = new URL("https://www.google.com/images");
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println(url.getHost());
        } catch (MalformedURLException e) {
            System.out.println("ups");
        }
    }

    public static void load() throws FileNotFoundException {
            FileInputStream fileInputStream = new FileInputStream("greetings.txt");
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
    }
}
