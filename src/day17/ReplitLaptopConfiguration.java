package day17;

import java.util.Scanner;

public class ReplitLaptopConfiguration {
    public static void main(String[] args) {


        double laptopPrice=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize = input.nextDouble();
        System.out.println("Select CPU type:");
        String CPU= input.next();
        System.out.println("Select RAM size:");
        int RAM = input.nextInt();
        System.out.println("Select storage type:");
        String storage = input.next();
        System.out.println("Select memory size:");
        int memory= input.nextInt();
        System.out.println("Enter screen resolution:");
        String resolution = input.next();

if(screenSize==13.3) {
    laptopPrice += 200;
}else if(screenSize==15.0){
    laptopPrice+=300;
}else if(screenSize==17.3){
    laptopPrice+=400;
}


if(CPU.equals("i3")) {
    laptopPrice+=150;

}else if(CPU.equals("i5")){
    laptopPrice+=250;
}else if(CPU.equals("i7")){
    laptopPrice+=350;
}


if(storage.equals("HDD")){
    laptopPrice+=(memory/500)*50;
}else if(storage.equals("SSD")){
    laptopPrice+=(memory/500)*100;
}

if(resolution.equals("FULLHD")){
    laptopPrice+=100;
}else if(storage.equals("4K")){
    laptopPrice+=200;
}
        System.out.println("Laptop price is: "+(laptopPrice+(RAM/4)*50));

}
}
