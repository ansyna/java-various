public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,4,6,7};
        array = reverseArray(array);
        System.out.println("Here you are \n");
        for (int elem : array) {
            System.out.println(elem);
        }

        double value = Math.pow(2, 2);
    }
    
    private static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int endPointer = array.length - i - 1;
            int tempVarValue = array[i];
            array[i] = array[endPointer];
            array[endPointer] = tempVarValue;
        }
        
        return array;
    }
}
