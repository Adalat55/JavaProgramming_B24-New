package day33_Multidimensional_Arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {1,55, 100, 200};

        System.out.println(Arrays.binarySearch(nums,55));
        System.out.println(Arrays.binarySearch(nums, 200));
    }
}
