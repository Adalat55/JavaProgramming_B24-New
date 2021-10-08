package replit_practices.Methods;

public class FIbonachiNumbers {
    public static void main(String[] args) {
        int count=10;
        int num1=0;    //10th fib number
        int num2=1;
        int num3;
        System.out.print(num1+" "+num2);
        for(int i=2; i<count;i++){

            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;

        }


    }
}
