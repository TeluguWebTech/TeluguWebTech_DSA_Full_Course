import java.util.Arrays;

public class Bubble_Sort {

    public static void main(String[] args) {
        int[] collections = {55,36,8,14,45,2, 12,155,286,94,185};
        bubbleSort(collections);

        System.out.println(Arrays.toString(collections));
    }

    public static void bubbleSort(int[] col){
        int arrLen = col.length;

        for(int i=0; i<col.length-1; i++){
            boolean swapped = false;

            for(int j=0; j<arrLen-i-1; j++){
                if(col[j] > col[j+1]){
                    int temp = col[j];
                    col[j] = col[j+1];
                    col[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }


    }
}
