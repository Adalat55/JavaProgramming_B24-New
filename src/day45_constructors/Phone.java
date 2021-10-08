package day45_constructors;

public class Phone {

    String brand;
    String model;
    double price;
    boolean hasCamera;

    public Phone(String inputBrand, String inputModel, double inputPrice, boolean camera){
        brand=inputBrand;
        model=inputModel;
        price=inputPrice;
        hasCamera=camera;
    }

    public void isOrdered (){
        System.out.println("Your order for "+brand+" "+model+" is on the way. Your total price: $"+price);
    }

    @Override
    public String toString() {
        return "Phone Info:" +
                "\nbrand: " + brand +
                ", model: " + model +
                ", price: " + price +
                ", hasCamera: " + (hasCamera?"yes":"no");
    }

    public static void main(String[] args) {
        Phone phoneOne = new Phone("Iphone", "13 Pro", 1099.9, true);

        phoneOne.isOrdered();
        System.out.println(phoneOne);
    }
}
