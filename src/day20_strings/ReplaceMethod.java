package day20_strings;

public class ReplaceMethod {
    public static void main(String[] args) {

        String word = "java";

        word=word.replace('a','e');

        System.out.println(word);

        String word2 = "softskills";
        System.out.println(word2.replace('s','X'));

        String msg = "hello today is sunday";

        System.out.println(msg.replace(" ", ""));




    }
}
