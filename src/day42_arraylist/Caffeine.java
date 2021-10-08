package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    /*
    Arraylist of caffeined drinks
    figure out how much caffeine each drink has, and store that into a new Arraylist
    coffee -80
    tea - 50
    monster-100
    red bull -100
    coke - 70
    pepsi -70
    bang-100
    apple juice-0
     */

    public static void main(String[] args) {

       String [] allDrinks= {"coffee","tea","monster","red bull","coke","pepsi","bang","apple juice"};

        ArrayList<String > drinkList= new ArrayList<>(Arrays.asList(allDrinks));

        ArrayList<Integer> caffeineAmounts = new ArrayList<>();
        int caffeinNum=0;

        for(String eachDrink : drinkList){

            switch (eachDrink){

                case "coffee":






            }

            ArrayList<Integer> caffeinAmounts= new ArrayList<>(Arrays.asList(80,50,100,70,70,100,0));

        }






    }


}
