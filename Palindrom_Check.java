public class Palindrom_Check {

        public static boolean pCheck(String val){
            int start = 0;
            int end = val.length()-1;

            while (start<end) {
                if(val.charAt(start) != val.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }

    public static void main(String[] args) {
        String word = "radar";
        System.out.println( pCheck(word));
    }
}
