package replit_practices.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static int[] mergeArrays(int [] arr1, int[] arr2){

        int index=0;
        int [] merged= new int[arr1.length+arr2.length];

        for(int i=0; i< arr1.length;i++){
            merged[index++]=arr1[i];
        }
        for(int j=0; j<arr2.length;j++){
            merged[index++]=arr2[j];
        }
        return merged;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergeArrays(nums, nums2)));
    }
}
