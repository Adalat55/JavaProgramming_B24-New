package day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CharArray {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter your name");
        String name = input.next();

        char[] charName= name.toCharArray();

        System.out.println(Arrays.toString(charName));
    }
}
