package day41_arrayList;

import java.util.ArrayList;

public class SetMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.set(0, 1000);

        System.out.println(nums); //set = replaces element

    }
}
