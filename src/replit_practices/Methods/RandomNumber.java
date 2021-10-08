package replit_practices.Methods;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        int min = 100;
        int max = 300;
       int a = (int)(Math.random()*(max-min+1)+min);
        System.out.println(a);
        int c = (int)(Math.random()*(max-min+1)+min);
        System.out.println(c);
        int s = (int)(Math.random()*(max-min+1)+min);
        System.out.println(s);

        Random random = new Random();

        int z = random.nextInt(100);
        System.out.println(z);
        boolean f = random.nextBoolean();
        System.out.println(f);
    }
}
