package day41_arrayList;

import java.util.ArrayList;

public class LoopingWithForEachLoop {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(21);
        nums.add(53);
        nums.add(90);

        for (int each: nums){
            if(each%2==1){
                System.out.println(each);
            }
        }
    }
}
