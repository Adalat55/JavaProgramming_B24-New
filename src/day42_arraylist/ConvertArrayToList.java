package day42_arraylist;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer[]a={1,2,3};

        Arrays.asList(a);

        AbstractList<Integer> list = new ArrayList<>(Arrays.asList(a));
        System.out.println(list);

        AbstractList<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,5));



    }
}
