package day34_methods;

public class AverageMulti {
    public static void main(String[] args) {

        int[][] nums={
                {3, 4, 5, 6},
                {5, 2, 6},
                {10,40, 20}

        };
        double averageForEach=0;

        double sumFor2D=0;

        for( int [] each: nums) {
            double sumForArrays=0;
            for (int eachNum : each) {
                sumForArrays += eachNum;
            }

            averageForEach=sumForArrays/each.length;
            sumFor2D+=averageForEach;
            System.out.println("avearge number for each array: "+averageForEach);
        }
        System.out.println("average for nums: "+sumFor2D/nums.length);
    }
}
