package day10_scanner;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your age");
        byte age = input.nextByte();
        System.out.println("enter your favourite number");
        long favouriteNum = input.nextLong();
        System.out.println("are you a student: true or false");
        boolean isStudent = input.nextBoolean();
        System.out.println("This is your personal info: ");
        System.out.println("age: "+age);
        System.out.println("favourite number: "+favouriteNum);
        System.out.println("are you a student: "+ isStudent);



    }
}
