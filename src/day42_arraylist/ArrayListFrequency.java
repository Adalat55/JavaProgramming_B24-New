package day42_arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListFrequency {

    public static void main(String[] args) {

        AbstractList<Integer> nums= new ArrayList<>(Arrays.asList(5,2,1,4,5,1,5));

        System.out.println(Collections.frequency(nums, 5));



    }
}
