package day45_constructors;

public class NewEmployee {

    String name;
    int id;
    String jobTitle;
    double salary;

    public NewEmployee(String inputName, int inputId, String inputTitle, double inputSalary){
        name=inputName;
        id=inputId;
        jobTitle=inputTitle;
        salary=inputSalary;
    }
    public void goToMeeting(){
        System.out.println(name+" is going to meeting");
    }

    @Override
    public String toString() {
        return "NewEmployee{" +
                "name: '" + name + '\'' +
                ", id: " + id +
                ", jobTitle: '" + jobTitle + '\'' +
                ", salary: " + salary +
                '}';
    }


}
