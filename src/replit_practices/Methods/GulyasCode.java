package replit_practices.Methods;

import java.util.Scanner;

public class GulyasCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = new String[in.nextInt()];
        for (int i = 0; i < strs.length; i++) {
            strs[i] = in.next();
        }
        int countDupl =0;

        for (int i = 0; i < strs.length; i++) {
            int count = 0;

            for (String each: strs){
                if (each.equals(strs[i])) { ;
                    count++;
                }
            }if (count>1){
                countDupl++;

            }
        }System.out.println(countDupl);
    }
}
