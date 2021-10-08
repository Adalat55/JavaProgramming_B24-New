package replit_practices.Methods;

import java.util.Scanner;

public class GetDuplicates {
    public static int getDup(String[] r) {

        int counter=0;
        for(int i=0;i<r.length;i++){
            int dupCounter=0;
            for(int j =0; j<r.length;j++){
                if(r[i].equals(r[j])){
                    dupCounter++;
                }
            }
            if(dupCounter>1){
                counter++;
            }
        }
            return counter;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] arr = new String[input.nextInt()];
        for(int i =0; i< arr.length;i++){
            arr[i]= input.next();
        }
        System.out.println(getDup(arr));


    }
}
