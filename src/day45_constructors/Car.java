package day45_constructors;

public class Car {

    int year;
    String make;
    String model;
    String color;
    int horsePower;
    double price;
    boolean isFourDoor;

    public Car(int inputYear, String inputMake, String inputModel, String inputColor, int inputHorse, double inputPrice, boolean inputDoors){

        year = inputYear;
        make= inputMake;
        model=inputModel;
        color=inputColor;
        horsePower=inputHorse;
        price=inputPrice;
        isFourDoor=inputDoors;

    }
    public void isOrdered(){
        System.out.println("Your order for "+make+ model+" is placed. It's color is "+color+".");
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", price=" + price +
                ", isFourDoor=" + isFourDoor +
                '}';
    }
}
