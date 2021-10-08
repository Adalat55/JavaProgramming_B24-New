package ExtraPractices;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {
        /*
        You have a mood ring and need to know what mood you are in based on the color. The color will also provide a max budget value that is suggested for shoppingdata:pink:mood: happybudget: 200blue:mood: relaxedbudget: 150orange:mood: nervousbudget: 50red:mood: angrybudget: 0
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your color");
        String clr= input.next();
        switch (clr){
            case "pink":
                System.out.println("mood: happy");
                System.out.println("your budget: 200");break;
            case "blue":
                System.out.println("mood:relaxed");
                System.out.println("your budget: 150");break;
            case "orange":
                System.out.println("mood:nervous");
                System.out.println("your budget: 50");break;
            case "red":
                System.out.println("mood: angry");
                System.out.println("your budget: 0");break;



        }

    }
}
