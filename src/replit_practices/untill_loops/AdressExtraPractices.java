package replit_practices.untill_loops;

import java.util.Scanner;

public class AdressExtraPractices {
    public static void main(String[] args) {
        /*
        A person will enter their address into a String. Make sure the String is not empty. If it is empty print: "No address found".
If there is an address, make all the text uppercase to match the expected formatEx: Input: 231332leaf ave, lake city 3132Output: 231332 LEAFAVE, LAKE CITY 3132Ex: Input: ""Output: No address found
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter adress");
        String adress = input.nextLine().toUpperCase();
        String newAdress;
        newAdress=adress.isEmpty()? "No address found": adress;

        System.out.println(newAdress);
    }
}
