package replit_practices.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AddElements {

    public static int [] addElements(int[] arr1, int[] arr2){


        int[] addedArr= new int[5];

            for(int j=0;j< arr1.length;j++){
                addedArr[j]=arr1[j]+arr2[j];
            }



      return addedArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[5];
        int [] nums2 = new int[5];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums.length; i++) {
            nums2[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(addElements(nums, nums2)));
    }
}
