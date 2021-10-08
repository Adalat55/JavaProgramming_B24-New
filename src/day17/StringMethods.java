package day17;

public class StringMethods {
    public static void main(String[] args) {

        String name = "james";
        System.out.println(name.equals("james"));

        System.out.println(name.equals("James"));

        System.out.println(name.equalsIgnoreCase("James"));

        System.out.println(name.equalsIgnoreCase("JaMes"));

        System.out.println(name.toUpperCase());

        System.out.println(name);
        System.out.println("-----------------");
        String lastNmae= "bond";
        lastNmae.toUpperCase();
        System.out.println(lastNmae);

       String word="monday ";
      int length =word.length();
        System.out.println(length );
    }
}
