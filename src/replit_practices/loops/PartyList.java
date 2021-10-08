package replit_practices.loops;

import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        String addMore="";
        String guestList="";
        do{

            System.out.println("Please enter guest name:");
            guestList+= input.next()+", ";
            System.out.println("Do you want to enter new guest name:");
            addMore= input.next();

        }while(!addMore.equals("no"));
        guestList=guestList.substring(0,guestList.length()-1);
        System.out.println(guestList);
    }
}
