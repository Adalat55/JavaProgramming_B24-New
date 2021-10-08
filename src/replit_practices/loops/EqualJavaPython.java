package replit_practices.loops;

import java.util.Scanner;

public class EqualJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int javaCount=0;
        int phytonCount=0;
        for(int i =0; i<sentence.length()-3;i++){
            if(sentence.substring(i,i+4).equals("java")){
                javaCount++;
            }
        }
        for(int i=0; i<sentence.length()-5;i++){
            if (sentence.substring(i,i+6).equals("python")){
                phytonCount++;
            }
        }
        if(javaCount==phytonCount){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
