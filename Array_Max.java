public class Array_Max {
    public static void main(String[] args) {
        int[] scores = {55,68,78,89,125,135,145,566, 2, 46, 11, 949, 1145, 11200, 13600};
        int bigValue = findMax(scores);
        System.out.println("max value is " + bigValue);
    }
    public static int findMax(int[] col){
        if(col.length ==0){
            throw new IllegalArgumentException("Array must have elements");
        }
        int max = col[0];
        for (int i =1; i< col.length; i++){
            if(col[i] >max){
                max = col[i];
            }
        }
        return max;
    }
}   
