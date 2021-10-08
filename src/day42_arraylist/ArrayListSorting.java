package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(4,20,50, 502, 150, -40, -10));
        Collections.sort(nums);

        System.out.println(nums);


    }
}
