public class Arr_Del_Start {
        public static void main(String[] args) {
            int[] cricket = {5,6,7,8,9,10,11};
            int[] score = delStart(cricket);

            for(int i=0; i<score.length; i++){
                System.out.print(score[i] + " ");
            }
        }
        public static int[] delStart(int[] cricket){
            if(cricket== null || cricket.length==0){
                return cricket;
            }
            int[] monday = new int[cricket.length-1];

            for(int i=1; i<cricket.length; i++){
                monday[i-1] = cricket[i];
            }
            return monday;
        }
}
