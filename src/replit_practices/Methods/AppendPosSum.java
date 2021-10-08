package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPosSum {
    public static ArrayList appendPosSum(ArrayList <Integer> arrList){

        ArrayList<Integer> newArrList= new ArrayList<>();
        int sum=0;
        for(int i=0;i<arrList.size();i++){
            if(arrList.get(i)>0){
           newArrList.add(arrList.get(i));
           sum+=arrList.get(i);
            }
        }

        newArrList.add(sum);

        return  newArrList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}
