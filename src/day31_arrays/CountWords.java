package day31_arrays;

import java.util.Arrays;

public class CountWords {
    public static void main(String[] args) {

        String s = "java is fun";

        String[] arr= s.split(" ");

        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
