public class Boolean {
    public static void main(String[] args) {
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1);
        System.out.println(bool2);

        String sentence = "hello";
        String sentence2 = "hello2";

        if (!sentence.equals(sentence2))
            System.out.println("yay");
        else 
            System.out.println("nay");

        int number = 2;
        
        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other");
                break;
        }

    }
}
