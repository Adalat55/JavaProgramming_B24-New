package replit_practices.loops;

public class catAndDogs {
    public static void main(String[] args) {

        String str= "catanddogdog";
        int cats=0;
        int dogs=0;

        for(int i =0;i<str.length()-2;i++){
            String eachThreeLetters="";

            if(str.substring(i,i+3).equals("cat")){
                cats++;
            }
            if(str.substring(i,i+3).equals("dog")){
                dogs++;
            }

        }
           if(cats==dogs){
               System.out.println(true);
           }else{
               System.out.println(false);
           }



    }
}
