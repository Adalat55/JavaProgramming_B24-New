package day17;

import java.util.Scanner;

public class ReplitBurgerOrChicken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       String order = input.nextLine();

      if(order.equals("burger")||order.equals("chicken")){
          System.out.println(10.0);
      }else if(order.equals("soda")){
          System.out.println(2.0);
      }else if(order.equals("fries")){
          System.out.println(3.5);
      }



    }
}
