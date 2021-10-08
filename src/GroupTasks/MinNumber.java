package GroupTasks;

public class MinNumber {
    public static int findMin( int ... arr){
        int min=arr[0];

        for (int each: arr) {
            if(each<min){
                min=each;
            }
        }
         return min;
    }

    public static void main(String[] args) {
        System.out.println(findMin(34, 2, -45, 65));
    }
}
