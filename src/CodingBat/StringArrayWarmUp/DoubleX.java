package CodingBat.StringArrayWarmUp;

public class DoubleX {
    public static boolean doubleX(String str){
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='x'&&str.charAt(i+1)=='x'){
                return  true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(doubleX("xaxaxa"));
    }
}
