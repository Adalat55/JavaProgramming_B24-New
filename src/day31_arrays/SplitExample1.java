package day31_arrays;

import java.util.Arrays;

public class SplitExample1 {
    public static void main(String[] args) {

        String s= "monday,tuesday,wednesday";

        String [] days=s.split(",");
        System.out.println(Arrays.toString(days));

        String s2 = "Jan-Feb-Mar-Apr";

        String[] months= s2.split("-");

        System.out.println(Arrays.toString(months));
    }
}
