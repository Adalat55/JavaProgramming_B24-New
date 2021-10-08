package day40_arraylist;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();

        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");


        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        list.remove(list.size()-1);

        System.out.println(list);

        list.remove(0);

        System.out.println();






    }
}
