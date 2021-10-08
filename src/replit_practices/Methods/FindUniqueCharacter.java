package replit_practices.Methods;

public class FindUniqueCharacter {
    public static void main(String[] args) {
        String str="AAABBBCCCDEF";
        String unique="";

        for(int i =0; i<str.length();i++){
            int count=0;
            for(int j=0; j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                unique+=str.charAt(i);
            }
        }

        String str1= " i love java";
        System.out.println(unique);
    }
}
