package day37_methods;

public class CountLetter {

    public static int frequencyOfChar(String word, char letter){
        int counter=0;
        for(int i=0; i<word.length();i++){
            if(word.charAt(i)==letter){
                counter++;
            }
        }
                return counter;
    }





}
