public class Binary_Search {
    public static void main(String[] args) {
        int[] collections = {22,33,56,85,96,125,136,158, 165,175,189};
        int target = 33;
        int result = binSearch(collections, target);

        if(result !=-1){
            System.out.println("elemen found at index: " + result);
        }else{
            System.out.println("element not found");
        }
    }
    public static int binSearch(int[] col, int val){
        int start =0;
        int end = col.length-1;

        while (start<=end) {
            int mid = start+ (end-start)/2;
            if(col[mid] == val){
                return mid;
            }else if(val < col[mid]){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return -1;
    }
}
