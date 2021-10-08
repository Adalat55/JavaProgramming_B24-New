package replit_practices.Arrays;

import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        for(int i =0; i<7;i++){
            System.out.println("enter score for judge "+(i+1));
            score[i]= input.nextInt();
        }
        System.out.println("Enter the difficulty number");
        double difficulty= input.nextDouble();

        double biggestScore=score[0];
        double smallestScore=score[0];
        double scoreTotal=0;

        for(int i =0; i<score.length;i++){
            scoreTotal+=score[i];
        }
        for(int i =0; i<score.length;i++){
            if(score[i]>biggestScore){
                biggestScore=score[i];
            }
            if(score[i]<smallestScore){
                smallestScore=score[i];
            }
        }

        System.out.println("Total: "+(scoreTotal-biggestScore-smallestScore)*difficulty*0.6);

    }
}
