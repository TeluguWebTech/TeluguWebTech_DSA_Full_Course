public class ArrayBasics {

    public static void main(String[] args) {
        // Method 1: Declaration + Initialization (separate lines)
        // int[] numbers;
        // numbers = new int[5];
     

     
        // Method 2: Declaration + Initialization (single line)
        // int[] numbers = new int[5];
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;
        // numbers[3] = 40;
        // Method 3: Declaration + Initialization + Values (one line)
        int[] numbers3 = {22,33,44,55,66}; //O(1)
        System.out.println("out put is "+ numbers3[2]); 

    }
}
