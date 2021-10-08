package day38_methods;

import my_utilities.ArraysUtil;

import java.util.Arrays;

public class MergeArrayWithMethod {
    public static void main(String[] args) {
        int[] a = {4, 1, 5};
        int[] b = {2,6};
        System.out.println(Arrays.toString(ArraysUtil.addElement(a,b)));

    }
}
