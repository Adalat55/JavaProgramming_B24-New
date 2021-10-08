package day43_arraylist_methods;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkMethods {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(3,2,5,6,4));

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(10,20));

        nums.addAll(other);

        System.out.println(nums);
        nums.addAll(0,other);

        System.out.println(nums);

        System.out.println(nums.removeAll(Arrays.asList(150)));

        System.out.println(nums);



    }
}
