package day38_methods;

public class ArrayAsParameter {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,1,4};
        printArray(a);
    }
    public static void printArray(int... arr){
        for (int each:arr){
            System.out.println(each);
        }
    }
//    public static void printArray( String elementint, int ... arr){
//        for (String each:arr){
//            System.out.println(each);
//        }
//    }
}
