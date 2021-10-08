package day29_array;

import java.util.Arrays;
import java.util.Scanner;

public class Information {
    public static void main(String[] args) {

        /*
        student array
        id-> 0
        first name ->1
        last name -> 2
        batch number-> 3
         */
        String [] studentOne = { "1234", "James", "Bond", "7"};

        String [] studentTwo = new String [4];

        studentTwo[0]="1235";
        studentTwo[1]="Mr";
        studentTwo[2]="Smith";
        studentTwo[3]="24";

        System.out.println(Arrays.toString(studentOne));
        System.out.println(Arrays.toString(studentTwo));

        Scanner input= new Scanner(System.in);

        String [] studentThree= new String[4];
        System.out.println("enter your id");
        studentThree [0]= input.next();
        System.out.println("enter your name");
        studentThree [1]= input.next();
        System.out.println("enter your last name");
        studentThree [2]= input.next();
        System.out.println("enter your batch number");
        studentThree [3]= input.next();

        System.out.println(Arrays.toString(studentThree));

    }
}
