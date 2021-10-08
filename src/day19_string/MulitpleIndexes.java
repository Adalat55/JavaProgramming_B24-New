package day19_string;

public class MulitpleIndexes {
    public static void main(String[] args) {

        String word = "definition";
        System.out.println("first  i position: " + word.indexOf('i'));
        System.out.println("last i position: "+ word.lastIndexOf('i'));


        int secondIHardCoded = word.indexOf('i', word.indexOf('i')+1);

    }
}
