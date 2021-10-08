package day34_methods;

public class Car {
    public static void main(String[] args) {
        unlockAndOpenDoor();
        getIntoCarAndCloseDoor();
        putOnBelts();
        checkmirrors();
        startCar();
        drive();

        driveInAHurry();

    }

    public static void unlockAndOpenDoor() {
        System.out.println("Unlock and open the door");
    }
    public static void getIntoCarAndCloseDoor() {
        System.out.println("Get into the car and close door");
    }
    public static void putOnBelts(){
        System.out.println("Put on seat belt");
    }
    public static void checkmirrors(){
        System.out.println("Checking the left mirror");
        System.out.println("Checking the right mirror");
        System.out.println("Checking the rear view mirror");
    }
    public static void startCar(){
        System.out.println("Putting key in and turn to start it");
    }
    public static void drive(){
        System.out.println("Put the car into drive and press the gas pedal");
    }

    public static void driveInAHurry(){
        unlockAndOpenDoor();
        getIntoCarAndCloseDoor();
        startCar();
        drive();
    }
}