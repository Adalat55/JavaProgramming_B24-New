package day19_string;

public class indexOfExample {
    public static void main(String[] args) {
         //charAt-> takes a number(index) and gives back a char
        //indexOf -> takes a char/Sting and gives back the position

      String s = "java";
        System.out.println(s.indexOf("ja"));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('z'));

        System.out.println(s.indexOf("vi"));
    }
}
