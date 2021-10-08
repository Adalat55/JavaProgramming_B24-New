package day38_methods;

import my_utilities.ArraysUtil;

public class CountElements {
    /*
    create a method that accepts an int array and a number
    count and return the number of times the number found int he array

     */

    public static int freguencyOfElements(int[] arr, int num){
        int counter=0;
        for(int each:arr){
            if(each==num){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int [] arr={1,2,4,2,6,7,9,7,6};
        System.out.println(freguencyOfElements(arr,6));
        ArraysUtil.getUniqueElements(arr);
    }
}
