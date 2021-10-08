package day34_methods;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMultiArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] allWords= new String[3][];
        System.out.println("enter multiple words separated by a space");
        String[] first= input.nextLine().split(" ");
        allWords[0]= first;

        System.out.println("enter the next words");
        allWords[1]=input.nextLine().split(" ");
        System.out.println("enter the last words");
        allWords[2]=input.nextLine().split(" ");

        System.out.println(Arrays.deepToString(allWords));
    }
}
