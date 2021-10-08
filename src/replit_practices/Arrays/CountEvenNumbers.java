package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int evenNums=0;
        for(int i=0;i<nums.length;i++){

            if(nums[i]%2==0){
                evenNums++;
            }
        }
        System.out.println("nums -> "+ Arrays.toString(nums)+ " -> "+evenNums);
    }
}
