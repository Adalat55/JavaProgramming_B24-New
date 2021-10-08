package replit_practices.untill_loops;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        challenge: if you want to push yourself, otherwise don't worry about this one, we will talk about Strings and loop after some more time

write a program that can remove duplicates from a string
    ex:"abcabc"
    output:abc
         */
//        String word = "abcabc";
//        int length = word.length();
//        int firstIndex=0;
//        int secondIndex=1;
//        int num = 1;
//        String removed = "";
//        String remainWord="";
//
//        while(num<=length) {
//
//
//            removed = word.substring(firstIndex++, secondIndex++);//a b
//
//            num++;
//            remainWord=word.substring(firstIndex);
//
//            if(remainWord.contains(removed)){
//
//                System.out.print(removed);
//
//
//            }
//
//
//        }
//
              String s = "abcdabcabc";
              String uniquechars= "";

              for(int i=0;i<s.length();i++) {
                  if (!uniquechars.contains("" + s.charAt(i))) {

                      uniquechars += s.charAt(i);
                  }

              }
        System.out.println(uniquechars);















        }
    }

