package office_hours.practice_09_22_2021;

public class ArraysAndCharacters {
    public static int frequencyOfChar(String [] words, char letter){

        int counter=0;
        for(String each: words){

            for(char eachLetter : each.toCharArray()){
                if(eachLetter==letter){
                    counter++;
                }
            }
        }
    return counter;
    }
}
