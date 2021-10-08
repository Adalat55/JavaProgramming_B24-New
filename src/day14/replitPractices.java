package day14;

import java.util.Scanner;

public class replitPractices {
    public static void main(String[] args) {
        /*
         Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.
 - If item is not in the list, display message: _**"Invalid item!"**_.
 - If price is more than 100$, display message: _**"Sorry, not enough funds on your gift card!".**_

> **_List of items_**
> Blanket - 60$
> Charger - 25$
> Hat - 25$
> Headphones - 30$
> Laptop - 200$
> Pants - 50$
> Pillow - 40$
> Smartphone - 1000$
> Socks - 5$
> USB cable - 10$

Hint: if/ else if / else or switch statement

Examples:

```
input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$
```
         */

        Scanner input = new Scanner(System.in);

        System.out.println("choose your item");
        String Item= input.nextLine();
        double cardBalance= 100;
        double itemPrice=0;

        if(Item.equals("Blanket - 60$")&&cardBalance-itemPrice>=0){
            itemPrice=60;
           if(cardBalance-itemPrice>=0) {


               System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" +(cardBalance-itemPrice));
        }else{
               System.out.println("you dont have enough balance");
           }
        if(Item.equals("Charger - 25$")){
            itemPrice=25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" +(cardBalance-itemPrice));
        }if(Item.equals("Hat - 25$")){
            itemPrice=25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" +(cardBalance-itemPrice));
        }if(Item.equals("Headphones - 30$")){
            itemPrice=30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" +(cardBalance-itemPrice));
        }if(Item.equals("Laptop - 200$")){
            itemPrice=200;
                if(cardBalance-itemPrice>=0){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: $" +(cardBalance-itemPrice));
        }else{
                    System.out.println("balance low");
                }



    }


}}}








