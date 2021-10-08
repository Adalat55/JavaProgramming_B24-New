package replit_practices.Methods;

public class BiggerString {
    public static String bigger(String a ,String b){
        String result="";
        if(a.length()>b.length()){
            return a;
        }else{
            return b;
        }

    }
}
