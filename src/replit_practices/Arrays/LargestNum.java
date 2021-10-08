package replit_practices.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rows = inp.nextInt(), cols = inp.nextInt();//30  40
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows-1; i++) {
            for (int j = 0; j <= cols-1; j++) {
                arr[i][j] = inp.nextInt();
            }
        }
        //FINAL PRINT
        int max = arr[0][0];
        for (int[] eachArr : arr) {
            for (int eacNumber : eachArr) {

                if (eacNumber > max) {
                    max = eacNumber;
                }
            }
        }
        for (int i = 0; i <= rows - 1; i++) {

            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = max;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}



