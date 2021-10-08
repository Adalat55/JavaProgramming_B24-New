package day47_constructor;

import java.util.Scanner;

public class Item {
    /*
    name,quantity, unit price
     */
    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Item(String name, int quantity, double unitPrice){

        this.name=name;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
        calculateTotal();
    }
    public Item(String name){
        this.name=name;
    }
    public double calculateTotal(){
        totalPrice=quantity*unitPrice;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice= $" + unitPrice +
                ", totalPrice= $" + totalPrice +
                '}';
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Item itemOne = new Item("Box",5, 2 );

        itemOne.calculateTotal();

        System.out.println(itemOne);


        String keepGoing = "yes";

        while (keepGoing.equalsIgnoreCase("yes")){

            System.out.println("what is the item name?");
            String name = input.nextLine();
        }


    }
}
