package day20_strings;

public class LongestWithA {
    public static void main(String[] args) {

        String firstWord ="pples";
        String secondWord= "computer";
        String thirdWord = "jeve";
String biggest ="";
 if(firstWord.contains("a")&&firstWord.length()>biggest.length()){
     biggest=firstWord;
 }
if(secondWord.contains("a")&&secondWord.length()>biggest.length()){
            biggest=secondWord;
}
            if(thirdWord.contains("a")&&thirdWord.length()>biggest.length()){
                biggest=thirdWord;
            }
        System.out.println(biggest.isEmpty()?"none are valid": "biggest: "+biggest);
    }
}
