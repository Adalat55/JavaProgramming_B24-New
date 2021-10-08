package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindNonDublicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
         //[1, 1, 2, 3, 4, 3, 4] -> 2
        int unique=0;
        for(int i =0;i< nums.length;i++){
            int counter=0;

            for(int j=0; j<nums.length;j++){
                if(nums[j]==nums[i]){
                    counter++;
                }
            } if(counter==1){
                unique=nums[i];
            }
        }


        System.out.println(Arrays.toString(nums)+" -> "+unique);

    }
}
