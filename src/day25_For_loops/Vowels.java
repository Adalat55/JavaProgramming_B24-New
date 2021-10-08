package day25_For_loops;

public class Vowels {
    public static void main(String[] args) {

        String str="banana is tasty";
        String voewls="aeiou";
        int counter=0;

        for (int i =0; i<str.length();i++){

          if(voewls.contains(""+str.charAt(i)))  {
              counter++;
          }




        }
        System.out.println(counter);


    }
}
