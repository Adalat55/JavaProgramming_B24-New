package replit_practices.untill_loops;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String resume = "";
        int count = 1;
        double totalPrice = 0;
do{
    System.out.println("Enter Item"+count+" and its price:");
    String item = scan.next();
    Double price = scan.nextDouble();

    shoppingListReport+="Item"+count+": "+item+" Price: "+price+",";
    totalPrice+=price;
    count++;
    System.out.println("Add one more item?");//Item1: Tomatoes Price: 5.5,
    resume= scan.next();


}while( resume.equals("yes")&& count<=10);

        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalPrice);
    }
}
