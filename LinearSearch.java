public class LinearSearch {

    public static int searchLinear(int[] collection, int val){
        for(int i=0; i<collection.length; i++){
            if(collection[i]== val){
                return i;
            }
        }
        return -1;
    }   

    public static void main(String[] args) {
            // int[] order = {22,35,56,85,96};
            int[] unOrder = {11,2,56,16,85};
            int target = searchLinear(unOrder, 2);

            System.out.println( "found value at index " + target);
    }

}
