package day34_methods;

public class GetCharacters {



    public static void printAtoZInUppercase() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");

        }
        System.out.println();
    }

    public static void printAtoZInLowercase() {
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.print((char)i + " ");

        }
        System.out.println();
    }


    public  static void PrintReverseZtoAUppercase(){
        for(int i ='Z'; i>='A';i--){
            System.out.print((char) i+" ");

        }
        System.out.println();
    }
    public static void PrintReverseZtoALowercase(){
        for(int i='z'; i>='a';i--){
            System.out.print((char)i+" ");
        }
        System.out.println();
    }
    public static void print0to9(){
        for(int i='0';i<='9';i++){
            System.out.print((char) i+" ");
        }
        System.out.println();
    }
}