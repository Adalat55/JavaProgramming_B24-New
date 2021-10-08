package day39_wrapper_arraylist;

public class WrapperExample1 {
    public static void main(String[] args) {

        int a = 5;

        Integer i1 = new Integer(10);
        Integer i2=100;
        System.out.println(i1);
        System.out.println(i2);

        byte b=(byte)500;
        Byte b2=(byte)500;
        System.out.println(b); //doesnt

        long l=1000L;
        Long l2= new Long(2000L);
        Long l3=37L;

        Float f1= new Float(4.5F);


    }
}
