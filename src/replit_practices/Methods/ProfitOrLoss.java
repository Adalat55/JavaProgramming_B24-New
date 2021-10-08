package replit_practices.Methods;

public class ProfitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here
        String profit="";
        if(buyPrice<sellPrice){
            profit+="profit";
        }else if(buyPrice>sellPrice){
            profit+="loss";
        }else if(buyPrice==sellPrice){
            profit+="no loss";
        }

return profit;


    }
}
