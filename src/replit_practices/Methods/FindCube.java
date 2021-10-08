package replit_practices.Methods;

import java.util.Scanner;

public class FindCube {
    public static void cube(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int num= input.nextInt();

        int cube= num*num*num;
        System.out.println(cube);
    }

    public static void main(String[] args) {
        cube();
    }
}
