public class Even_Odd {

    public static void main(String[] args) {
        int[] collection = {2,5,8,14,25,36,55,65,82, 11, 136};
        countEvenOdd(collection);
    }
    public static void countEvenOdd(int[] col){
        int even =0;
        int odd = 0;

        for(int num :col){
            if(num%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even numbers count is: " + even);
        System.out.println("odd numbers count is: " + odd);
    }
}
