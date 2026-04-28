import java.util.Arrays;

public class Arr_Reverse {
    public static void main(String[] args) {
        int[] collections = {22,56,125,89,36,145};
        arrReverse(collections);
        System.out.println(Arrays.toString(collections));
    }
    public static void arrReverse(int[] col){
        int start = 0;
        int end = col.length-1;

        while(start<end){
            int swapVal = col[start];
            col[start]=col[end];
            col[end] = swapVal;
            start++;
            end--;
        }
    }
}   
