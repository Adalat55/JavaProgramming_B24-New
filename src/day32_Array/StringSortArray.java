package day32_Array;

import java.util.Arrays;

public class StringSortArray {
    public static void main(String[] args) {
        String [] strs = {"4java", "8eight", "Hello", "hello", "HEllo", "$dollar"};

        Arrays.sort(strs);


        System.out.println(Arrays.toString(strs));
    }
}
