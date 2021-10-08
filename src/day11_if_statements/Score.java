package day11_if_statements;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scoreMax=100;
        int rightAnswer=85;
        System.out.println("Enter your answer");
        int answer1 = input.nextInt();
if(answer1==rightAnswer){
    scoreMax-=scoreMax/10;
    System.out.println("your score is: "+scoreMax);

}
        System.out.println("enter your answer");
int answer2 = input.nextInt();
if(answer2==rightAnswer){
    scoreMax-=scoreMax/5;
    System.out.println("your score is: "+scoreMax);

}
        System.out.println("enter your answer");
int answer3 = input.nextInt();
if(answer3==rightAnswer){
    scoreMax-=(scoreMax*35/100);
    System.out.println("your score is: " + scoreMax);
}





    }
}
