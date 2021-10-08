package day37_methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(convertNumberToWord(-1));
    }


    public  static String convertNumberToWord(int num){
        if(num<=0||num>10){
            return "out of range";
        }
        String[] word={"one","two","three","four","five","six","seven","eight","nine","ten"};

        return word[num-1];
    }
}
