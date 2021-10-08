package day15_Switch;

import java.util.Scanner;

public class Browsers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("which browser do you want to use");
        String browser = input.next();
        System.out.println("Enter the url:");
        String url = input.next();


        switch (browser){

            case "chrome":
                System.out.println("Opening "+ url+ " in chrome");
                break;
            case "firefax":
                System.out.println("Opening "+ url+ " in firefax");
                break;
            case "safari":
                System.out.println("Your mac is opening safari");
                System.out.println("Going to "+ url);
                break;
            case "ie":
                System.out.println("IE is no longer supported");
                break;
            case "edge":
                System.out.println("Edge is opening "+url);
                break;



        }

    }
}
