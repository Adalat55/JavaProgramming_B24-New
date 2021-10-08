package day14;

import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your month number");
        int month = input.nextInt();
        if(month>=1&& month<=12){
            if (month ==2){
                System.out.println("28 days");
            }else if(month==4||month==6||month==9||month==11){
                System.out.println("30 days");
            }else{
                System.out.println("31 days");
            }

        }else System.out.println("invalid month number.can only be from 1-12");
    }
}
