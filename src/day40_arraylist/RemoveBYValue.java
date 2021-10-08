package day40_arraylist;

import java.util.ArrayList;

public class RemoveBYValue {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("pen");
        list.add("mouse");
        list.add("marker");

        list.remove("mouse");

        System.out.println(list);

        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(2);
        arr.add(1);

        System.out.println(arr.remove(1));
        String s ="35";
        System.out.println(s.charAt(0));
    }
}
