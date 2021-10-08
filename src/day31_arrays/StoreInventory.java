package day31_arrays;

public class StoreInventory {
    public static void main(String[] args) {

        String [] items = {"Shoes","Jackets","Gloves","AirPod","Ipod","Backpack"};
        double [] prices = {89.99, 150.0, 9.99, 250.0, 439.5, 39.99};
        int    [] itemIds= {12345, 12346, 12347, 12348, 12349, 12350};

        boolean hasJackets=false;

        for(String eachItem : items){

            if(eachItem.equals("Jackets")){
                hasJackets=true;
            }
        }
        if(hasJackets){
            System.out.println("Yes we have jackets, Do you want some?");
        }else{
            System.out.println("No sorry, we don't have jackets");
        }

        double maxPrice = prices[0];
        int indexOfMax=0;


    for(int i =0; i<items.length;i++){

        if(prices[i]>maxPrice){
            maxPrice=prices[i];
            indexOfMax=i;
        }
    }
        System.out.println("the most expensive item is: ");
        System.out.println("item id: "+itemIds[indexOfMax]);
        System.out.println("name: "+items[indexOfMax]);
        System.out.println("price: "+prices[indexOfMax]);
    }
}
