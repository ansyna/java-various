import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Betty");
        names.add("Igor");
        names.add("Bobby");
        names.set(2,"Bob");

        names.add(3,"Rodger");
        names.add(4,"Marley");
        names.remove(1);
        for (int i = 0; i < names.size(); i++) {
            System.out.print(i + "_");
            System.out.println(names.get(i));
        }
    }
}
