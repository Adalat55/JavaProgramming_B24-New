package day16_switch_practices;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your month");
         int days = 0;

        String month = input.next();

        switch(month){
            case "february":
                days=28;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days=30;
                break;
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                    days=32;
                    break;
            default:
                System.out.println("invalid month entered");
        }

        if(days!=0) {


            System.out.println(days+ " days");

        }

    }
}
