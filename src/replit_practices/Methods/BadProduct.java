package replit_practices.Methods;

public class BadProduct {
    public static boolean badP(int[] products,int limit){

        boolean intact=true;
        int badProdCounter=0;

        for(int each: products){
            if(each==0){
                badProdCounter++;
            }
        }
        if(badProdCounter>=limit){
            intact=false;
        }

        return intact;
    }
}
