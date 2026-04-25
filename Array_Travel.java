public class Array_Travel {
    public static void main(String[] args) {
        int[] marks = {55,65,75,85,95};
        System.out.println("Suresh got " + marks[3]); //O(1) constant

        // forward travel
        for(int i =0; i< marks.length; i++){
            System.out.println("printin all ememets "+ marks[i]);   // O(n)
        }
        // Reverse travel
        for(int i = marks.length-1; i>=0; i--){
            System.out.println("Reverse ememets "+ marks[i]);
        }
        for(int student: marks){
            System.out.println("All marks "+ student);
        }
    }
}
