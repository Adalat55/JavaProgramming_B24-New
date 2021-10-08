package day41_arrayList;

import java.util.ArrayList;

public class RemoveByObject {
    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(100);
        nums.add(500);
        nums.add(700);
        nums.add(900);

        nums.remove(0);

        Integer a =700;
        nums.remove(a);
        nums.clear();

        System.out.println(nums.isEmpty());



        System.out.println(nums);
    }
}
