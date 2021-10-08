package day05_variables;

public class CellPhone {

    public static void main(String[] args) {

        String brand = "Iphone";
        String model = "11 Max";
        String color = "black";
        double price = 899.99;
        String storage = "64 GB";
        boolean hasCamera = true;
        color = "Silver";

        System.out.println("Information for the " + model);
        System.out.println(model + " is an "+ brand);
        System.out.println("This phone comes in "+ color+ " and has "+ storage +" storage" );
        System.out.println("Has a camera: " + hasCamera);
        System.out.println("All of this for $" + price);

        System.out.println(brand + " "+ model);

String info = "\t\t\tInformation for the " +model+ "\n"+ " is an "+ brand+ "\nThis phone comes in "+ color+ " and has "+ storage +" storage\n"+
        "Has a camera: " + hasCamera;

        System.out.println(info);





    }



}
