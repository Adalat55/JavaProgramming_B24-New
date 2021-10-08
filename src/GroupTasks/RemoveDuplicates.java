package GroupTasks;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        //Q3: String -- Remove Duplicates.
        //Write a return method that can remove the duplicated values from String
        //Ex:  removeDup("AAABBBCCC")  ==> ABC


        String unique="";

        for(int i =0; i<str.length();i++){
            if(!unique.contains(str.charAt(i)+"")){
                unique+=str.charAt(i);
            }
        }

        return  unique;
    }

}
