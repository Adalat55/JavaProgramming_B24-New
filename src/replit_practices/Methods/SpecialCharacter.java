package replit_practices.Methods;

public class SpecialCharacter {
    public static void main(String[] args) {

        String str= "!@DGHnbvg789";
        String special="";
        String number="";
        String upper="";
        String lower="";

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                number+=str.charAt(i)+" ";
            }else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upper+=str.charAt(i)+" ";
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lower+=str.charAt(i)+" ";
            }else {
                special+=str.charAt(i)+" ";
            }
        }
        System.out.println(number);
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(special);

    }
}
