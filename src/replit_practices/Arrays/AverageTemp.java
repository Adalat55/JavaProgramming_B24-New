package replit_practices.Arrays;

import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
  scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        double tempSum=0;
        double average=0;
        for(int i =0; i<temps.length;i++){
            tempSum+=temps[i];
        }
        average=tempSum/temps.length;
        System.out.println(average);
    }
}
