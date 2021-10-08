package day45_constructors;

public class Employee {
    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String inputName, int inputId, String inputJobTitle,double inputSalary){
        name=inputName;
        id=inputId;
        jobTitle=inputJobTitle;
        salary=inputSalary;
    }
    public void goToMeeting(String str){
        name= str;
        System.out.println(name+" going to a meeting");

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee firstEmployee = new Employee("James", 1234, "SDET", 120000.0);

        firstEmployee.goToMeeting("Bond");

        System.out.println(firstEmployee);
    }
}
