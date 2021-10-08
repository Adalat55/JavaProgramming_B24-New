package replit_practices.Methods;

public class SwapString {
    public static void main(String[] args) {

//        String str1="java";         //Seleniumjava  //javaSelenium
//        String str2="Selenium";
//        String str3=str1;
//        str1=str2;
//        str2=str3;
//        str1=str1+str2;  //javaSelenium
//
//       str2 =str1.substring(0,str1.length()-str2.length());
//       str1 =str1.substring(str2.length());
//
//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//
//        int a =10;
//        int b =20;
//
//        a =a+b;
//        b=a-b;
//        a=a-b;
//
//        System.out.println(a);
//        System.out.println(b);
//
//
    }
    public static void fib(int num) {

        int num1 = 0;
        int num2 = 1;
        int num3;
        System.out.print(num1 + " " + num2);
        for (int i = 2; i < num; i++) {

            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }

}
