package day37_methods;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(DublicateChar("apple"));
    }

    //apple

    public static char DublicateChar (String word){
        int duplicateCounter=0;
        char duplicateChar=' ';
        for(int i=0; i<word.length();i++){
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==word.charAt(i)){
                    duplicateCounter++;
                }
            }
            if (duplicateCounter==2){
                duplicateChar=word.charAt(i);
        }

        }

        return duplicateChar;

    }



}
