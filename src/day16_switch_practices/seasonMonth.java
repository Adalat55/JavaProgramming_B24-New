package day16_switch_practices;

import java.util.Scanner;

public class seasonMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the month number");

        int month = input.nextInt();
        String season = "";

        switch(month){
            case 12:
            case 1:
            case 2:
                season= "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "fall";
                break;
            default:
                season = "invalid month given";

        }
        System.out.println(season);


    }
}
