package replit_practices.Methods;

public class SwapStrings {
    public static void main(String[] args) {
//
//        String a = "hello";
//        String b = "world";
//
//        String c; // we created this temporary variable to store our value
//        c=a; // we stored a value in this temp variable
//        a=b; //we stored b value in the a variable
//        b=c; // we took the value we stored in temperory variable c and reassigned to b

//       // int i=10;
//        int k=20;
//
//        i=i+k;
//        k=i-k;
//        i=i-k;
//
//        System.out.println(i);
//        System.out.println(k);
//
//
//
//
//        System.out.println(a);
//        System.out.println(b);
//


//
        String a = "Hello";
        String b = "World";

        a=a+b;  //HelloWorld
        b=a.substring(0,a.length()-b.length()); // substring from helloworld =hello
        //System.out.println(b);
        a=a.substring(b.length()); //substring from helloworld= world
        System.out.println(a);
        System.out.println(b);
    }







    }

