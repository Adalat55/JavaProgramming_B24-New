package day08_relational_logical_operators;

public class GiftCard {

    public static void main(String[] args) {

        double balance = 200;
        double price1 = 40;
        double prince2 = 100;


        System.out.println("buy item 1 and it cost $40");
         balance -=40;
        System.out.println("gift card balance: $" +balance);
        System.out.println("buy item 2 and it cost $100");
         balance -=100;
        System.out.println("gift card balance: $"+ balance);


    }


}
