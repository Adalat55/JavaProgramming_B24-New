package day17;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int house = input.nextInt();
        int player = input.nextInt();

        if(player>21){
            System.out.println("player busts");
        }else if(house >player){
            System.out.println("player loss");
        }else if(house==player){
            System.out.println("its a tie");
        }else if(player>house){
            System.out.println("player win");
        }



    }
}
