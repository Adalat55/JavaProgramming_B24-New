package day29_array;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        int [] ages={10,14,21, 80,-19,40,50};

        System.out.println(ages.length);
        System.out.println(Arrays.toString(ages));

        System.out.println(ages[ages.length-2]);

        double [] name = {10.5, 20.9, 10.0};
        System.out.println(name[0]+" "+name[1]);
    }
}
