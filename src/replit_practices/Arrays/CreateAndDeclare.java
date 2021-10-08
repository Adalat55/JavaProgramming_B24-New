package replit_practices.Arrays;

import java.util.Arrays;

public class CreateAndDeclare {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE


//        int[][] values= {
//                {8, 20, 50},
//                {12, 30, 75}
//        };
            int[][] values= new int[2][3];

            values[0][0]=8;
            values[0][1]=20;
            values[0][2]=50;
            values[1][0]=12;
            values[1][1]=30;
            values[1][2]=75;



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(values));
    }
}
