package CodingBat.StringArrayWarmUp;

public class Last2 {
    public static int substringTimes(String str){
        int counter=-1;
        for(int i=0; i<str.length()-1;i++){
            if(str.substring(i,i+2).equals(str.substring(str.length()-2))){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(substringTimes("axxxaaxx"));
    }
}
