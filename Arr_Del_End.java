public class Arr_Del_End {
    public static void main(String[] args) {
        int[] footBall = {5,6,7,8,9,10,11, 44, 55};
        int[] score = delEnd(footBall);

        for(int i=0; i<score.length; i++){
            System.out.print(score[i] + " ");
        }
    }
    public static int[] delEnd(int[] fooBall){
        if(fooBall==null || fooBall.length ==0){
            return fooBall;
        }
        int[] result = new int[fooBall.length-1];

        for(int i=0; i<result.length; i++){
            result[i] = fooBall[i];
        }
        return result;
    }
}
