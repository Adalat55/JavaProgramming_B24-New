package replit_practices.Methods;


public class numberPolindrome{

    public static void isPalindrome(int num){


        int remainder=0;
        int reverse=0;
        int original=num;

        if(num<0){

            System.out.println(false);
        }
        while(num>=1){
            remainder= num%10;
           reverse=(reverse*10)+remainder;
           num=num/10;
        }

        if(reverse==original){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

}
        }
