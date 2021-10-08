package day44_custom_classes;

public class UsingApp {
    public static void main(String[] args) {
        App firstApp = new App();

        firstApp.name = "Fleet";
        firstApp.version = 2.0;
        firstApp.isFree= true;

       firstApp.update();


        System.out.println("App information");
        System.out.println("Name: "+firstApp.name);
        System.out.println("Version: "+firstApp.version);
        System.out.println(firstApp.isFree?"App is free":"App cost some money");
    }
}
