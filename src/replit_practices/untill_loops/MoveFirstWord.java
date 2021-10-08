package replit_practices.untill_loops;

import java.util.Scanner;

public class MoveFirstWord {
    public static void main(String[] args) {
/*
Given a sentence. Display the sentence with the first word moved to the end of the sentence. Ex:Input: Java, is a fun languageOutput: is a fun language Java Hint: Use indexOf and substring
 */
        Scanner input = new Scanner((System.in));
        System.out.println("enter a sentence");
        String sentence = input.nextLine();
        int index = sentence.indexOf(" ");
        String afterCut= sentence.substring((index)+1);
        String firstWord = sentence.substring(0,index);

        System.out.println(afterCut+" "+firstWord);

    }
}
