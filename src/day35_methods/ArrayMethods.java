package day35_methods;

public class ArrayMethods {
    public static void main(String[] args) {

        int[] a={50,4, 100, 80,90, 32};

        getFirstArrayElement(a);
        getLastArrayElement(a);
        getMiddleArrayElement(a);
    }


    /*
    make a method ecepts the array. find and print the first element
    make a method ecepts the array. find and print the last element
    make a method ecepts the array. find and print the middle element
     */

    public static void getFirstArrayElement(int[] nums) {

        System.out.println(nums[0]);
    }

    public static void getLastArrayElement(int[] nums) {

        System.out.println(nums[nums.length - 1]);

    }

    public static void getMiddleArrayElement(int[] nums) {

        if(nums.length % 2 == 1){
            // odd length    12345  5/2 -> 2

            System.out.println("Middle element: " + nums[nums.length/2]);

        } else {
            // even length 012345   6/2 -> 3

            System.out.println("First middle element: " + nums[nums.length/2 - 1]);
            System.out.println("Second middle element: " + nums[nums.length/2]);

        }
    }
}