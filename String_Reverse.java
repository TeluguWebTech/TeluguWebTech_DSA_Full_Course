public class String_Reverse {
    
    public static String reverse(String val){
        String target = "";
        for(int i= val.length()-1; i>=0; i--){
            target += val.charAt(i);
        }
        return target;
    }

    public static void main(String[] args) {
        String city = "eluru";
        System.out.println("string reversed :" + reverse(city));
    }
}
