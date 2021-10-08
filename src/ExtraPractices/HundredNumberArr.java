package ExtraPractices;

import java.util.Arrays;

public class HundredNumberArr {
    public static void main(String[] args) {
        /*
        1.Create an int array called numbers that has length of 1002.Assign 1-100 to each index of the array.  Then use a for each loop to print out all the elements of the array
         */

        int [] numbers =new int[100];

        for(int i =0; i<100; i++){

            numbers[i]=i+1;
        }

        System.out.println(Arrays.toString(numbers));


    }
}
