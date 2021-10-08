package replit_practices.untill_loops;

import java.util.Scanner;

public class ConsoleMenuReplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int choice=input.nextInt();
        if(choice==1){
            System.out.println("user selected 1");
        }
        if(choice==2){
            System.out.println("user selected 2");
        }
        if(choice==3){
            System.out.println("user selected 3");
        }

    }
}
