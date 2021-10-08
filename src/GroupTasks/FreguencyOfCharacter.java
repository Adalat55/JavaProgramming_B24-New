package GroupTasks;

public class FreguencyOfCharacter {
    public static String characterFreguency(String str) {
        //Q1: String -- Frequency of Characters
        //Write a return method that can find the frequency of characters
        //Ex:  FrequencyOfChars("AAABBCDD ") ==> A3B2C1D2

        str= str+" ";
        int counter=0;
        String chars="";

        for(int i =0; i<str.length()-1;i++){
            counter++;

            if(str.charAt(i)!=str.charAt(i+1)){

                chars+=""+str.charAt(i)+counter;
                counter=0;
            }
        }
       return chars;

    }

    public static void main(String[] args) {
        System.out.println(characterFreguency("java"));
    }

}
