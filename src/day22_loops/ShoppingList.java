package day22_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        /*
        continue to store items to the shopping list
         */
        Scanner input = new Scanner(System.in);
        String shoppingList="";
        String addMore;
        do{
            System.out.println("what do you want to add to the list ");

            shoppingList+= input.nextLine()+", ";

            System.out.println("Do you wanna add more? y or n");
            addMore = input.nextLine();

        }while(addMore.equalsIgnoreCase("y")||addMore.equalsIgnoreCase("yes"));
        System.out.println("this is your whole shopping list");
        System.out.println(shoppingList.substring(0,shoppingList.length()-2));






    }
}
