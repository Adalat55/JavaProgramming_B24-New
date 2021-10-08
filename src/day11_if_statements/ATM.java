package day11_if_statements;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("*** Welcome to the ATM ***");
        System.out.println("Please enter passcode");

        int inputPasscode = input.nextInt();
        int validPasscode = 1234;

        if (inputPasscode==validPasscode){
            //valid and logged in
            System.out.println("Logged in!");
            System.out.println("Select a number");
            System.out.println("\t1) Check balance");
            System.out.println("\t2) deposit");
            System.out.println("\t3) withdraw");
            int selection = input.nextInt();
            if(selection==1){
                System.out.println("your balance is $"+ 1_000_000);


            }
            if(selection==2){
                System.out.println("Enter your bills in the slot");
            }
            if(selection==3){
                System.out.println("Take your money from the dispenser");
            }




        } else{
            System.out.println("Invalid passcode");
            System.out.println("Try again");
        }



    }
}
