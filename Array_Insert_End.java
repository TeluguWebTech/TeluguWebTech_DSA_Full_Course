import java.util.Arrays;

public class Array_Insert_End {
       public static void main(String[] args) {
        int[] scores = {20,30,40};
        int opener  = 180;

        int[] updateScore = new int[scores.length + 1];
     
        System.out.println("confirm" + updateScore.length);
        
        for(int i =0; i<scores.length; i++ ){
            updateScore[i] = scores[i];
        }
            updateScore[scores.length] = opener;
        System.out.println("this is newArray " + Arrays.toString(updateScore));
    }

}
