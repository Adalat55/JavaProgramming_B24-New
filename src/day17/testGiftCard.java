package day17;

import java.util.Scanner;

public class testGiftCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your item name");
        String item = input.nextLine();
        int cardBalance = 100;
        switch(item){
            case "Blanket": cardBalance-=60;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;

                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Charger": cardBalance-=25;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Hat": cardBalance-=25;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Headphones": cardBalance-=30;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Laptop": cardBalance-=200;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Pants": cardBalance-=50;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Pillow": cardBalance-=40;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Smartphone":cardBalance-=1000;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "Socks": cardBalance-=5;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            case "USB cable": cardBalance-=10;
                if(cardBalance<0){
                    System.out.println("Sorry, not enough funds on your gift card!");break;
                }else{
                    System.out.println("Thank you for your purchase!");
                    System.out.println("Your current balance is: "+cardBalance);break;
                }
            default:
                System.out.println("Invalid item");
    }
}}
