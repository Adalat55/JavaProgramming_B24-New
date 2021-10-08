package ExtraPractices;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        /*
        Given a String of words that follow Camel Case convention. FindandprinthowmanywordsareinthegivenString.Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercaseEx:Input:thisHasManyWordsToFindOutput: 6
         */
        Scanner input = new Scanner(System.in);
        System.out.println("enter a message");
        String str = input.nextLine();
        int counter=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                counter++;
            }

        }
                System.out.println("Number of words in the given message: "+(counter+1));


    }
}
