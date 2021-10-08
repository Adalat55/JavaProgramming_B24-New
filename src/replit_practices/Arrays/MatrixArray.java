package replit_practices.Arrays;

import java.util.Scanner;

public class MatrixArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},  {scan.nextInt(), scan.nextInt(), scan.nextInt()},
               {scan.nextInt(), scan.nextInt(), scan.nextInt()}};

        int result = 0;
        int sumLeftToRight=0;
        int sumRightToLeft=0;
        int num=0;

        for(int i =0; i<1;i++) {

            for (int k = 0; k <= matrix[i].length - 1; k++) {
                sumLeftToRight += matrix[k][k];
            }
            for (int j = matrix[i].length; j> 0; j--) {
                sumRightToLeft += matrix[num][j-1];
                num++;
            }
        }
                    result=sumLeftToRight-sumRightToLeft;
                    System.out.println(Math.abs(result));
        // FINAL PRINT

    }
}
//  1  2  3       
//  4  5  6
//  7  8  9