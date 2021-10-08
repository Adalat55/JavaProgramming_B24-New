package replit_practices.Methods;

public class MethodsWithReturns {
    public static int countAppearance(String[] arr,String t){

        int counter=0;

        for(String  eachWord: arr){
            if(eachWord.equals(t)){
                counter++;
            }
        }
        return counter;

    }









}
