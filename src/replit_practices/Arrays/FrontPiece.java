package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FrontPiece {
    public static void main(String[] args) {
/*
Given an int array num of any length, print a new array of its first 2 elements. If the array is smaller than length 2, use whatever elements are present.
 */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        int[] newNums=new int[2];
        if(num.length>=2){
        for (int i =0; i<newNums.length;i++) {
            newNums[i] = num[i];
        }
            System.out.println(Arrays.toString(newNums));
        }
        else {
            int[] newNumsShort=new int[1];
                for (int i =0; i<newNumsShort.length;i++) {
                    newNumsShort[i] = num[i];
            }
            System.out.println(Arrays.toString(newNumsShort));
        }


    }
}
