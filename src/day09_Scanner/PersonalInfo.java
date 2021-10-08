package day09_Scanner;
import java.util.Scanner;
/*
create a class PersonalInfocreate a main methodcreate a Scanner objectAsk the user to enter their age (byte),
ask them to enter their favorite number (long),and ask them if they are a student (boolean).Print all the values from the inputs
 */
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age ");
        byte age = input.nextByte();
        System.out.println("enter your favourite number ");
        long favNumber = input.nextLong();
        System.out.println("Are you a student: ");
        boolean isStudent = input.nextBoolean();
        System.out.println("my age is:"+age);
        System.out.println("my favourite number is: "+favNumber);
        System.out.println("I am a student: " +isStudent);
    }
}
