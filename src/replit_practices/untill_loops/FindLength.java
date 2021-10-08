package replit_practices.untill_loops;

import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = input.nextLine();
        int length = text.length();
        System.out.println("Length is: "+length);
    }
}
