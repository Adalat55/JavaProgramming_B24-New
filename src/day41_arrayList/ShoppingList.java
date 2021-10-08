package day41_arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();


        if(list.isEmpty()){
            System.out.println("you should add something to your list");
        }else{
            System.out.println("Your list has some things");
        }
        String keepasking="";
        do{
            System.out.println("what do you want to add?");
            String item =input.nextLine();
            list.add(item);

            System.out.println("do you want to add another item?");
            keepasking=input.nextLine();
        }while(keepasking.equals("yes"));

        System.out.println("this is your shopping list: "+list);
        System.out.println(list.size());

        System.out.println("do you want to remove something");
        String wantToRemove=input.nextLine();

        if(wantToRemove.equals("yes")){
            System.out.println("what do you want to remove");

            list.remove(input.nextLine());

        }

        System.out.println("size after removing items: "+list.size());

    }
}
