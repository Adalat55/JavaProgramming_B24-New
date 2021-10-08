package day11_if_statements;

public class Greeting {
    public static void main(String[] args) {
        int hour = 4;
        if(hour<12){
            System.out.println("Good morning!");
    }
        if(hour>12 && hour<15){
            System.out.println("Good afternoon!");}
        if(hour>15){
            System.out.println("Good evening!");
        }

        }
}
