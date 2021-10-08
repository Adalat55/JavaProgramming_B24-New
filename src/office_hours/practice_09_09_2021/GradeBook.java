package office_hours.practice_09_09_2021;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        /*
        Declare three arrays:1.String array which will hold names for the students (give values)2.Int array which has the score of the student got in the quiz (give values)3.Char array which will have some letter grade based on the score (empty)4.Output the gradebook at the end with all the information Grade scale:Above 85: AAbove 75: BAbove 65: COther: D
         */
        Scanner input =new Scanner(System.in);
        System.out.println("How many students we have");
        int size = input.nextInt();
        String [] students= new String[size];
        double [] scores= new double[size];
        char [] grades= new char[size];
        String[] fullInfo= new String[size];
        for (int i =0; i<size;i++){
            System.out.println("enter student "+(i+1));
            students[i]= input.next();
            System.out.println("enter "+students[i]+ "'s score");
            scores[i]=input.nextDouble();
            if(scores[i]>85){
                grades[i]='A';
            }
            else if(scores[i]>75){
                grades[i]='B';
            }
            else if(scores[i]>65){
                grades[i]='C';
            }
            else {
                grades[i]='F';
            }
            fullInfo[i]=students[i]+"|"+scores[i]+"|"+grades[i];
        }

        System.out.println(Arrays.toString(fullInfo));

    }
}
