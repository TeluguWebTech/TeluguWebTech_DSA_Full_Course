import java.util.Arrays;

public class Array_Insert_Index {
    public static void main(String[] args) {
        int[] scores = {20,30,40, 50, 60, 70, 80, 90};
        int opener  = 378;
        int position = 4;

         int[] updateScore = new int[scores.length + 1];
        for(int i =0; i< position; i++){
            updateScore[i] = scores[i];
        }
        updateScore[position] = opener;
        for(int j = position; j<scores.length; j++){
            updateScore[j + 1] = scores[j];
        }
        System.out.println(Arrays.toString(updateScore));
    }
    

}
