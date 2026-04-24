import java.util.Arrays;

public class Array_Insertion_Start {
    public static void main(String[] args) {
        int[] scores = {20,30,40};
        int opener  = 66;

        int[] updateScore = new int[scores.length + 1];
        updateScore[0] = opener;
        System.out.println("confirm" + updateScore.length);
        
        for(int i =0; i<scores.length; i++ ){
            updateScore[i + 1] = scores[i];
        }
        System.out.println("this is newArray " + Arrays.toString(updateScore));
    }

}
