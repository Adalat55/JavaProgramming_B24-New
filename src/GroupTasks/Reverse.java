package GroupTasks;

public class Reverse {
    //Q5: String -- Reverse
    //Write a return method that can reverse  String
    //Ex: Reverse("ABCD"); ==> DCBA

    public static String reverseString(String str){

        String reverse="";

        for(int i = str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }

       return reverse;
    }
}
