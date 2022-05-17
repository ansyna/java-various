import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArraysClass {
    public static void main(String[] args) {
        int[] integers = {1, 2, 3};
        String[] strArray = {"one", "two", "three"};
        for (String item : strArray) {
            System.out.println(item);
        } 
        System.out.println(strArray[0]);
        
        for (int i = 0; i < strArray.length; i++) {
            String temp = strArray[i]; 
            strArray[i] = temp + "_" +(i + 1);
            System.out.println(strArray[i]);
        }

        String arrayString = Arrays.toString(strArray);
        
        System.out.println(arrayString);

        String[] newArray = new String[5];
        int count = 0; 
        for (String item : newArray) {
            newArray[count] = count + "_str";
            count++;
        }
        System.out.println(Arrays.toString(newArray));

        String[] newestArray = Arrays.copyOf(newArray, newArray.length);
        System.out.println(Arrays.toString(newestArray));

        int[][] array2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] arrat2DD = new int[2][3];
        System.out.println(Arrays.toString(array2D[0]));
        System.out.println(Arrays.toString(arrat2DD[0]));

        for (int i = 0; i < array2D.length; i++){
            for (int j = 0; j < array2D[i].length; j++){
                System.out.println(array2D[i][j]);
            }

        }
        String[] array123 = returnArray();
        System.out.println(Arrays.toString(array123));
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "demo");
        map.put("fname", "fdemo");


        map.get("name"); // returns "demo"

        List<Map<String, String>> data = new ArrayList<>();
        data.add(0, map);
        data.get(0).get("name"); 

        /*
        But as you start using Java I am sure you will find that if you create a class/model that represents your data will be your best options. I would do

        class Person{
        String name;
        String fname;
        }
        List<Person> people = new ArrayList<Person>();
        Person p = new Person();
        p.name = "demo";
        p.fname = "fdemo";
        people.add(p);
        
        */
    }
    public static String[] returnArray() {
        return new String[] {"one", "two", "three"};
    }
}
