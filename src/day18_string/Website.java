package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the website");
       String webSite= input.nextLine();
       if(webSite.startsWith("www")&&webSite.endsWith(".com")||webSite.endsWith(".edu")||webSite.endsWith(".gov")||webSite.endsWith(".net")){
            System.out.println("this website is valid");
       } else {
           System.out.println("website is invalid");
       }
    }
}
