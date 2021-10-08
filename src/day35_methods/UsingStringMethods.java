package day35_methods;

import my_utilities.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("java"));
        System.out.println(StringUtil.reverse("soft skills"));

        String s = "racecar";
        String s2=StringUtil.reverse(s);
        System.out.println(s.equals(s2));

        Scanner input= new Scanner(System.in);
        System.out.println("enter some words");
        System.out.println(StringUtil.reverse(input.nextLine()));

        System.out.println("eneter your name");
        System.out.println(StringUtil.fixFormat(input.nextLine()));

    }
}
