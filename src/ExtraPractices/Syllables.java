package ExtraPractices;

import java.util.Scanner;

public class Syllables {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String msg= input.nextLine();

        int dashes=0;
        for(int i=0;i<msg.length(); i++){
            if(msg.charAt(i)=='-'){
                dashes++;
            }
        }
        System.out.println("syllables for this messages "+(dashes+1));
    }
}
