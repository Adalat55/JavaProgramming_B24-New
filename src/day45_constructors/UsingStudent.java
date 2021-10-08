package day45_constructors;

public class UsingStudent {
    public static void main(String[] args) {

        Student studentOne = new Student();

        studentOne.name= "James Bond";
        studentOne.batchNumber = 7;
        studentOne.grade = 90;

        System.out.println(studentOne);
    }
}
