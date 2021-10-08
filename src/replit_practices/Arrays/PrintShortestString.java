package replit_practices.Arrays;

import java.util.Scanner;

public class PrintShortestString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),           scan.next(), scan.next(), scan.next()};
        String shortest=str[0];

        for(int i =0; i<str.length;i++){
            if(str[i].length()<shortest.length()){
                shortest=str[i];
            }
        }
        System.out.println(shortest);

    }
}
