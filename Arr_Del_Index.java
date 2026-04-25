public class Arr_Del_Index {

    public static void main(String[] args) {
        int[] studentMarks = { 10, 20, 30, 40, 50 };
        int index = 3;

        int[] result = delAtIndex(studentMarks, index);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }
    public static int[] delAtIndex(int[] studentMarks, int index){
        if(studentMarks == null || studentMarks.length == 0){
            return studentMarks;
        }
        int[] wednesday = new int[studentMarks.length-1];

        for(int i=0, j=0; i<studentMarks.length; i++){
                if(i == index){
                    continue; //skip
                }
                wednesday[j] = studentMarks[i];
                j++;
        }
        return wednesday;
    }

}
