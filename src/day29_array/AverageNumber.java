package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many number do you want to enter");
        int size= input.nextInt();

        int[]nums=new int[size];

        for(int i =0; i<size;i++){

            System.out.println("enter a number "+(i+1));
            nums[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(nums));


       // int [] nums = {4,6,2,10};
        double average=0;
       double sum=0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];

        }
        average=sum/ nums.length;


        System.out.println(average);
    }
}
