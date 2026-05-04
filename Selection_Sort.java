public class Selection_Sort {
    public static void main(String[] args) {
        int[] scores = {18,4,55,65,24,87,6, -22,89,58,13,9};
        selectionSort(scores);
        printArray(scores);
    }

    public static void selectionSort(int[] col){

        int n = col.length;

        for(int i = 0; i<n-1; i++){
            int minValue = i;
            for(int j = i+1; j<n; j++ ){
                if(col[j]< col[minValue]){
                    minValue = j;
                }
                int temp = col[minValue];
                col[minValue] = col[i];
                col[i] = temp;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int val: arr){
            System.out.print(val + " ");
        }
    }
}   
