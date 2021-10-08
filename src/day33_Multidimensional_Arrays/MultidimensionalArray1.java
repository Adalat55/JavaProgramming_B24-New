package day33_Multidimensional_Arrays;

import java.util.Arrays;

public class MultidimensionalArray1 {
    public static void main(String[] args) {

        int[] a ={1, 2, 3};  // single dimensional
        int [] b = { 4, 5, 6}; // single dimensional

        int [][] all = {a, b}; //2d array
        int [][] newWay={{1,2,3},{4,5,6}};

        System.out.println(Arrays.toString(all[0]));
        System.out.println(Arrays.toString(all[1]));

        System.out.println(Arrays.deepToString(all));

    }
}
