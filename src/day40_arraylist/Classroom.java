package day40_arraylist;

import java.util.ArrayList;

public class Classroom {

    public static void main(String[] args) {

        ArrayList<String> groupOne= new ArrayList<>();

        System.out.println(groupOne);
        groupOne.add("vindar");
        groupOne.add("James Bond");
        groupOne.add("Tach");
        groupOne.add("Topcu");

        System.out.println(groupOne);

        System.out.println("first element:"+groupOne.get(0));
        System.out.println("second element:"+groupOne.get(1));
        System.out.println("third element:"+groupOne.get(2));
        System.out.println("fourth element:"+groupOne.get(3));

        System.out.println("first element first char: "+groupOne.get(0).charAt(0));


        ArrayList<String> groupTwo= new ArrayList<>();
        System.out.println(groupTwo.size());







    }
}
