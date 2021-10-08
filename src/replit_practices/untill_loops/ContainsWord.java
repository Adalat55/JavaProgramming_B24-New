package replit_practices.untill_loops;

import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        boolean contains =true;
        if(sentence.contains(word)){
            System.out.println(contains);
        }else{
            System.out.println(!contains);}

}}
