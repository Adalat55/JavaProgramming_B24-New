package day13_if_statements;

import java.util.Scanner;

public class YesOrNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name");
        String firstName = input.next();

        System.out.println(firstName+" do you like soccer");
        String likeSoccer = input.next();
        if (likeSoccer.equals("yes")){
            System.out.println("who is your fav team");
            String team = input.next();
            System.out.println("oh i like that "+ team + " too");
        } else if(likeSoccer.equals("no")){
            System.out.println("thats okay");
        }else{
            System.out.println("you did not answer the question");
        }
    }
}
