package day38_methods;

public class TypePromotions {

//    public static void use(float f){
//        System.out.println("using the float method");
//    }
    public static void use(double d){
        System.out.println("using the double method");
    }

    public static void main(String[] args) {
        use(3.5f);
    }
}
