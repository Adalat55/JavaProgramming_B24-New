package day16_switch_practices;

import java.util.Scanner;

public class switch_ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter colour");
        String colour= input.next();
        String action =colour.equals("green")? "go": "stop";
        System.out.println(action);


    }
}
