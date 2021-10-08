package replit_practices.Arrays;

import java.util.Scanner;

public class ArrayLargestNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        int biggest =arr[0][0];

        for(int[] eachArr: arr){

            for(int eachNum: eachArr){

                if(eachNum>biggest){
                    biggest=eachNum;
                }
            }
        }
                     System.out.println(biggest);
    }
}