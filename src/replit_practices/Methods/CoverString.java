package replit_practices.Methods;

public class CoverString {                                 //java
    public static String coverString(String main, String coverME) {
        // your code here
        String newVersion=main;
for(int i =0; i<main.length()-1;i++){
    if(main.substring(i,i+coverME.length()).equals(coverME)){

        newVersion+= main.substring(0,i)+"["+coverME+"]"+main.substring(i+coverME.length());

    }

}

return newVersion;

    }

    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o"));
    }
}
