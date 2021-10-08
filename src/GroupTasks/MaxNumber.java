package GroupTasks;

public class MaxNumber {

    public static int maxNumber( int ... arr){

        int max=arr[0];
        for(int each: arr){
            if (each > max) {
                max=each;
            }
        }

     return max;

    }

    public static void main(String[] args) {
        System.out.println(maxNumber(2, 5, 3, 67, 45));
    }

}
