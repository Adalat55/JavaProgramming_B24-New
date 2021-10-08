package day33_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //given an array, calculate the sum and put the sumvalue to a new element at end
        Scanner input =new Scanner(System.in);
        System.out.println("size");
        int size = input.nextInt();
        int[] arr= new int[size];

        int sum=0;
        for(int i =0; i< arr.length;i++){
            System.out.println("enter numbers");
            arr[i]= input.nextInt();
            sum+=arr[i];
        }
        int [] newArr = Arrays.copyOf(arr,arr.length+1);
        newArr[newArr.length-1]=sum;


        System.out.println(Arrays.toString(newArr));
    }
}
