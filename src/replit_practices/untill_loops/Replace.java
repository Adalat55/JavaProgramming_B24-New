package replit_practices.untill_loops;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message");
        String message = input.nextLine();
        System.out.println("enter a number");
        int num = input.nextInt();

        if(num==1){

            message=message.replace('a','e');
        }
        else if(num==2){

           message= message.replace('s','r');
        }
        else if(num==3){
            message=message.replace('o','z');
        }

        System.out.println(message);



    }
}
