package GroupTasks;

public class SortLetters {
    //Sort Letters and Numbers from alphanumeric String
    //Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
    //
    //Example:
    //Input:  "DC501GCCCA098911"
    //OutPut: "CD015ACCCG011899"
    public static void main(String[] args) {
        String str = "DC501GCCCA098911";
        String letters="";
        String digits = "";
        for(int i =0; i<str.length();i++){

           if(Character.isDigit(str.charAt(i))){
               letters=str.substring(0,str.charAt(i));
              str=str.substring(str.charAt(i));
           }else if(Character.isLetter(i)){
               str=str.substring(str.charAt(i));

           }

        }
        System.out.println(str);


    }
}
