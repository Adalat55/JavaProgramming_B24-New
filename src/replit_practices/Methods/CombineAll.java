package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {
    public static ArrayList<Integer>combineAl(ArrayList<Integer> first, ArrayList<Integer> second){

        ArrayList<Integer> combined = new ArrayList<>();
        combined.addAll(first);
        combined.addAll(second);

        return combined;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAl(list, list2));

    }
}
