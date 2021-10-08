package day35_methods;

public class OurMathClass {
    public static void main(String[] args) {
        add(0.5, 4.5);
        add(1,2);
        multiply(4,5);
    }



    public static void add(double numone, double numTwo){
        System.out.println(numone+"+"+numTwo+"="+(numone+numTwo));
    }
    public static void subtract(double numone, double numTwo){
        System.out.println(numone+"-"+numTwo+"="+(numone-numTwo));
    }
    public static void multiply(double numone, double numTwo){
        System.out.println(numone+"*"+numTwo+"="+(numone*numTwo));
    }
    public static void division(double numone, double numTwo){
        if(numTwo!=0) {
            System.out.println(numone + "/" + numTwo + "=" + (numone / numTwo));
        }else{
            System.out.println("Cannot divide by 0");
        }
    }
}
