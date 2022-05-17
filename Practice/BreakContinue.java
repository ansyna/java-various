public class BreakContinue {
    public static void main(String[] args) {
        for(int j = 0;j < 3; j++) {
            for(int i = 0;i < 10; i++) {
                if (i % 2 == 0) {
                    // skip the loop is even
                    continue;
                }
                // print the odd ones
                System.out.println(i);
            }
            // leave the loop all together 
            break;
        }
    }
}
