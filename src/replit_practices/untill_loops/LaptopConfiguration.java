package replit_practices.untill_loops;

import java.util.Scanner;

public class LaptopConfiguration {
    public static void main(String[] args) {

        double laptopPrice=0;

        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        if(screenSize==13.3){
            laptopPrice+=200;
        }
        if(screenSize==15.0){
            laptopPrice+=300;
        }
        if(screenSize==17.3){
            laptopPrice+=400;
        }
        System.out.println("Select CPU type:");
        String CPU= input.next();
        if(CPU.equals("i3")){
            laptopPrice+=150;
        }
        if (CPU.equals("i5")){
            laptopPrice+=250;
        }
        if(CPU.equals("i7")){
            laptopPrice+=350;
        }
        System.out.println("Select RAM size:");
        int RAM = input.nextInt();
        laptopPrice+=RAM/4*50;
        System.out.println("Select storage type:");
        String storage = input.next();
        System.out.println("Enter memory size:");
        int memory= input.nextInt();
        if(storage.equals("HDD")){
            laptopPrice+=memory/500*50;
        }
        if(storage.equals("SSD")){
            laptopPrice+=memory/500*100;
        }
        System.out.println("Enter screen resolution:");
        String resolution = input.next();
        if(resolution.equals("FULLHD")){
            laptopPrice+=100;
        }
        if(resolution.equals("4K")){
            laptopPrice+=200;
        }
        System.out.println("laptop price is: "+laptopPrice);
    }
}
