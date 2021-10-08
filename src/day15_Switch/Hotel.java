package day15_Switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the Java hotel");
        System.out.println("how many people in your party");
        int numberOfPeople = input.nextInt();
        System.out.println("how many days will you stay?");
        int numberOfDays = input.nextInt();

        double price= 0;
        String roomType= "";
        boolean validPartySize = true;

        switch (numberOfPeople) {

            case 1:
                roomType = "single room";
                price = numberOfDays * 100;
                break;
            case 2:
                roomType = "double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "large room";
                price = numberOfDays * numberOfPeople * 150;
                break;
            // when the value is 3 or 4 it runs the same code above
            case 5:
            case 6:
                roomType = "suite";
                price = 5000;
                break;
            //when the value 5 or 6 it runs the same code above
            default:
                System.out.println("Party size is too big");
                validPartySize=false;
        }
        if(validPartySize){
        System.out.println("Okay great, for " + numberOfDays+ " peopele staying for "+ numberOfDays+ " days your total price is "+ price+ " for a "+roomType);}





    }
}
