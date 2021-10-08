package ExtraPractices;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("upper or lower?");
        String msg= input.next();
        String alphabet="";
        if(msg.equals("upper")){

            System.out.print("do you want it ascending order or discending order?");
            String order =input.next();
            if(order.equals("ascending")){
                char letter='A';
            while(letter<='Z'){
                System.out.print(letter+" ");
                letter++;
            }
            }else if(order.equals("discending")){
                char letter='Z';
                while(letter>='A'){
                    System.out.print(letter+" ");
                    letter--;
                }
            }

        }
else if(msg.equals("lower")) {
            System.out.print("do you want it ascending order or discending order?");
            String order =input.next();
           if(order.equals("ascending")){
               char letter = 'a';

         while(letter<='z'){
             System.out.print(letter+" ");
               letter++;
         }
}else if(order.equals("discending")) {
               char letter = 'z';
               while (letter >= 'a') {
                   System.out.print(letter + " ");
                   letter--;
               }
           }
        }
    }
}
