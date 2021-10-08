package replit_practices.untill_loops;

import java.util.Scanner;

public class SMSParts {
    public static void main(String[] args) {
/*
Given a String in the following format:“Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}” Separate these parts and print them separately: Sender: actualSenderNumber: actualNumberMessage: actualMessage”
 */
        Scanner input = new Scanner(System.in);
        System.out.println("enter your String here");
        String message = input.nextLine();

        int startingIndexOfSender=message.indexOf("<");
        int endingIndexOfSender = message.indexOf(">");

        int startingIndexOfNumber=message.indexOf("[");
        int endingIndexOfNumber = message.indexOf("]");

        int startingIndexOfMessage=message.indexOf("{");
        int endingIndexOfMessage = message.indexOf("}");

        String sender = message.substring(startingIndexOfSender+1,endingIndexOfSender);
        String number = message.substring(startingIndexOfNumber+1,endingIndexOfNumber);
        String msg = message.substring(startingIndexOfMessage+1,endingIndexOfMessage);

        System.out.println("sender: "+sender+"\nnumber: "+number+"\nmsg: " +msg);

    }
}
